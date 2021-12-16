package 이차원배열;

import java.util.Scanner;

class DayOfYear{
	
	private int year;
	private int month;
	private int day;
	Scanner sc = new Scanner(System.in);
	
	public void Display() {
		do {
		System.out.println("그 해 경과 일수를 구합니다.");
		System.out.print("년 :");
		year = sc.nextInt();
		System.out.print("월 :");
		month = sc.nextInt();
		System.out.print("일 :");
		day = sc.nextInt();
		
		System.out.println("그 해 "+Count()+"일째입니다.");
		System.out.print("한 번 더 할까요? (1.예/2.아니오) : ");
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
