import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = sc.nextInt();
		int a = 50000;
		int b = 10000;
		int c = 5000;
		int d = 1000;
		int e = 500;
		int f = 100;
		int g = 50;
		int h = 10;
		int A,B,C,D,E,F,G,H;
		
		A= money/a;
		money = money%a;

		B=money/b;
		money=money%b;

		C=money/c;
		money=money%c;
		
		D=money/d;
		money=money%d;
		
		E=money/e;
		money=money%e;
		
		F=money/f;
		money=money%f;
		
		G=money/g;
		money=money%g;
		
		H=money/h;
		money=money%h;
		
		System.out.println("50000\t-----> "+A+"장");
		System.out.println("10000\t-----> "+B+"장");
		System.out.println("5000\t-----> "+C+"장");
		System.out.println("1000\t-----> "+D+"장");
		System.out.println("500\t-----> "+E+"장");
		System.out.println("100\t-----> "+F+"장");
		System.out.println("50\t-----> "+G+"장");
		System.out.println("10\t-----> "+H+"장");
		
	}

}
