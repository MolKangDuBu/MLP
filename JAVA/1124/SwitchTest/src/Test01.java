import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		Scanner sc = new Scanner(System.in);
		sel =sc.nextInt();
		
		switch(sel) {
			case 1: System.out.println("��Ÿ���� �ӱ��� ��÷");
			case 2: System.out.println("��Ÿ���� �Һ� ��÷");
			case 3: System.out.println("�ѽ� ���� �ɟ� ��÷");
			case 4: System.out.println("�̵�� Ŀ�ǹͽ� ��Ʈ ��÷");
			case 5: System.out.println("�ƽ� ȭ��Ʈ ��� Ŀ�ǹͽ� ��÷");
			
		}
		
	String s = "test";
	System.out.println("�ѱ۷� ���ڸ� �Է��ϼ���");
	s = sc.next();
	
	switch(s) {
		case "��":
			System.out.println("one");
			break;
		case "��":
			System.out.println("two");
			break;
		case "��":
			System.out.println("three");
			break;
		case "��":
			System.out.println("four");
			break;
		
	}
		
	}

}
