import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int money;
		int time;
		
		System.out.print("시간당 급여액 : ");
		money = sc.nextInt();
		System.out.print("근무시간 : ");
		time = sc.nextInt();
		
		System.out.println("주급은 "+money*time+" 이다.");
		
		
	}
}
