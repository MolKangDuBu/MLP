import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		String address;
		String phone;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.next();
		
		System.out.print("�ּ� : ");
		address =sc.next();
		
		System.out.print("��ȭ : ");
		phone = sc.next();
		
		System.out.printf("%s %s %s\n", name, address, phone);
		
	}

}
