import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money;
		int goal = 1000;
		
		
		System.out.print("실적을 입력하시오(단위: 만원) : ");
		money = sc.nextInt();
		if(goal<=money) {
			System.out.println("실적달성\n보너스 : "+(int)((money-goal)*0.1));
		}
		
		
	}

}
