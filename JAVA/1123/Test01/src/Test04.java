import java.util.Scanner;

public class Test04 {//number09

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B;
		System.out.print("A B �� �Է� : ");
		A= sc.nextInt();
		B= sc.nextInt();
		int C = (int)Math.sqrt(A*A+B*B);
		System.out.println("answer : "+C);
		
	}

}
