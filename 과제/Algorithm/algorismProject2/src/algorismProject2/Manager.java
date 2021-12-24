package algorismProject2;

import java.util.Scanner;

public class Manager {

	Scanner sc = new Scanner(System.in);
	BinaryTree bt = new BinaryTree();
	boolean run =true;
	public Manager() {
		display();

	}
	
	
	public void display() {
		int Num;
		String Name;
		while(run) {
			System.out.println("(1) ��ǰ ��� (2) ��ǰ ���� (3) ��ǰ �˻� (4) ��ü ��ǰ ��ȸ (5) ����");
			System.out.print("�޴� ���� : ");
			switch(sc.nextInt()) {
			case 1: System.out.println("��ǰ���");	
					System.out.print("��ǰ ��ȣ �Է� : ");
					Num = sc.nextInt();
					System.out.print("��ǰ�� �Է� : ");
					Name =sc.next();
					bt.insert(Num, Name);
				break;
			case 2:
				System.out.println("��ǰ ����");
				System.out.print("��ǰ ��ȣ �Է� : ");
				Num = sc.nextInt();
				bt.delete(Num);
				break;
			case 3:
				System.out.println("��ǰ �˻�");
				System.out.print("��ǰ ��ȣ �Է� :");
				Num  =sc.nextInt();
				bt.search(Num);
				break;
			case 4: 
				if(!bt.isEmpty()) bt.preorder(bt.root);
				break;
			case 5:
				run =false;
				break;
			}
		}
	}
}
