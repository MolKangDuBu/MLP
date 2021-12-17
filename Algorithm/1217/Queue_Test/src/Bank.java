import java.util.Scanner;

public class Bank {
	
	private Scanner sc = new Scanner(System.in);
	public Queue<Integer> q;
	private boolean Run= true;
	private int Input;
	
	
	public Bank() {
		q = new Queue<Integer>(50);
		Display();
		
	}
	
	
	
	public void Customer() {
		
		q.put(1);
		System.out.println("����ȣ�� ����"+q.MAX()+"���̸� ������� ����� "+(q.Count())+"�� �Դϴ�."+
							"��� �ð��� "+q.Count()*2+"���Դϴ�.");
	}
	
	public void Manager() {
		if(q.isEmpty()) {
			System.out.println("������� �մ��� �����ϴ�.");
		}else {
			System.out.println((q.MIN()+1)+"�� �մ� â�� ������ ���ּ���");
			q.get();
		}
		
	}
	
	
	public void Display() {
		System.out.println("���� ��ȣǥ �̱�");
		System.out.println("------------------");
		
		while(Run) {
			System.out.println("1. �մ�\n2. �����\n0. ����");
			Input = sc.nextInt();
			switch(Input) {
			case 1:
				Customer();
				break;
			case 2:
				Manager();
				break;
			case 0:
				Run =false;
				break;
			}
			
		}
	}
	
	
	
}
