import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		int month;
		
		
		do {
			System.out.print("�ùٸ� ���� �Է��ϼ���[1-12] : ");
			month= sc.nextInt();
		}while(month<1||month>12);
		
		System.out.println("����ڰ� �Է��� ���� "+month+" �Դϴ�.");
		
	}

}
