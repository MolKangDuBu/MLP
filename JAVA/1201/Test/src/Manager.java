import java.util.Random;
import java.util.Scanner;

public class Manager {
	
	final int MAX = 5;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int answer;
	int player;
	public Manager(){
		Display();
	}
	
	public void start() {
		int i=0;
		while(i++<MAX) {
			Input();
			if(Check(i))break;
		}
	}
	
	public void Input() {
		System.out.print("������ �Է����ּ��� : ");
		player = sc.nextInt();
		
	}
	
	public boolean Check(int i) {
		
		if(i ==MAX) {
			System.out.println("ȸ���� �ʰ��߽��ϴ�.");
			System.out.println("Game Over");
			return true;
		}
		
		if(answer == player) {
			System.out.println("�����Դϴ�!");
		}else if(answer>player) {
			System.out.println("�� ū���� �Է��ϼ���");
		}else if(answer<player) {
			System.out.println("�� ���� ���� �Է��ϼ���");
		}
		return answer == player;
	}
	
	
	
	public void Display() {
		System.out.println("  ���� ���߱� ����");
		System.out.println("ȸ���� 5�� �����Դϴ�!");
		System.out.println("------------------");
		System.out.println();
		answer = rd.nextInt(10)+1;
	}
}