import java.util.Scanner;

public class WeekPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시간당 급여액, 근무시간 입력 : ");
		int money = sc.nextInt();
		int time = sc.nextInt();

		
		if(time<20) {
			System.out.println("총금액 : "+money*time);
		}else {
			
			System.out.println("총금액 : "+((int)((time-20)*money*0.5)+money*time));
		}
		
		
		
		
		
	}

}
