import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int money;
		int goal = 1000;
		
		
		System.out.print("������ �Է��Ͻÿ�(����: ����) : ");
		money = sc.nextInt();
		if(goal<=money) {
			System.out.println("�����޼�\n���ʽ� : "+(int)((money-goal)*0.1));
		}
		
		
	}

}