import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		double m = sc.nextDouble();
		
		if(m<5.0) {
			System.out.println("����ϰų� ���� ���� ����");
		}else if(5.0<=m &&m<5.5) {
			System.out.println("�ణ�� ����");
		}else if(5.5<=m&&m<6.5) {
			System.out.println("�ߴ��� ����, ���� �μ����ų� ������");
		}else if(6.5<=m && m<7.5) {
			System.out.println("����, �� �Ǵ� �ǹ��� �ر��� �� ����");
		}else{
			System.out.println("���, ��κ��� �ǹ��� �ر���");
		}
		
		
	}

}
