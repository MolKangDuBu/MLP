import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int money;
		int time;
		
		System.out.print("�ð��� �޿��� : ");
		money = sc.nextInt();
		System.out.print("�ٹ��ð� : ");
		time = sc.nextInt();
		
		System.out.println("�ֱ��� "+money*time+" �̴�.");
		
		
	}
}
