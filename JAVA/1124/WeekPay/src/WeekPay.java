import java.util.Scanner;

public class WeekPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð��� �޿���, �ٹ��ð� �Է� : ");
		int money = sc.nextInt();
		int time = sc.nextInt();

		
		if(time<20) {
			System.out.println("�ѱݾ� : "+money*time);
		}else {
			
			System.out.println("�ѱݾ� : "+((int)((time-20)*money*0.5)+money*time));
		}
		
		
		
		
		
	}

}
