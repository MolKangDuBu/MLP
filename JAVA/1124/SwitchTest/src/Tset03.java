import java.util.Scanner;

public class Tset03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		int selcet;
		int rad, w, h;
		
		System.out.println("1. ���� ����\n2. �ﰢ���� ����\n3. �簢���� ����");
		selcet  = sc.nextInt();
		
		switch(selcet) {
		case 1:
			System.out.print("������ : ");
			rad = sc.nextInt();
			System.out.println("���� ������ "+(rad*rad*PI)+"�Դϴ�.");
			break;
		case 2:
			System.out.print("�غ� : ");
			w = sc.nextInt();
			System.out.print("���� : ");
			h = sc.nextInt();
			System.out.println("�ﰢ���� ������ "+((w*h)/2)+"�Դϴ�.");			
			break;
		case 3:
			System.out.print("���� : ");
			w = sc.nextInt();
			System.out.print("���� : ");
			h = sc.nextInt();
			System.out.println("�簢���� ������ "+(w*h)+"�Դϴ�.");			
			break;
		}
		
	}

}
