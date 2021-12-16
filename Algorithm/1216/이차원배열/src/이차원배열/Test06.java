package �������迭;

import java.util.Scanner;

class DayOfYear{
	
	private int year;
	private int month;
	private int day;
	Scanner sc = new Scanner(System.in);
	
	public void Display() {
		do {
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		System.out.print("�� :");
		year = sc.nextInt();
		System.out.print("�� :");
		month = sc.nextInt();
		System.out.print("�� :");
		day = sc.nextInt();
		
		System.out.println("�� �� "+Count()+"��°�Դϴ�.");
		System.out.print("�� �� �� �ұ��? (1.��/2.�ƴϿ�) : ");
		if(sc.nextInt()==1) {
				
		}else if(sc.nextInt()==2){
			return;
		}else {
			
		}
		}while(true);
	}
	
	public int Count() {
		int result =0;
		int[][] mdays = {
				{31,28,31,30,31,30,31,31,30,31,30,31},
				{31,29,31,30,31,30,31,31,30,31,30,31},
		};
		if(isLeap(year)) {
			for(int i=0; i<month-1;i++) result+=mdays[0][i];
		}else {
			for(int i=0; i<month-1;i++) result+=mdays[1][i];
		}
		return result+day;	
	}
	

	public boolean isLeap(int year) {
		return (year %4 ==0 &&year%100 !=0 ||year%400==0)?false:true;
	}
}



public class Test06 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayOfYear dy = new DayOfYear();
		dy.Display();
	}

}
