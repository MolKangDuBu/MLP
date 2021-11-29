import java.util.Scanner;

public class WeekPayManager {

	final int MAX = 3;
	WeekPay []pays = new WeekPay[MAX];
	Scanner sc = new Scanner(System.in);
	int count =0;
	
	
	public WeekPayManager() {	
		
		for(int i=0;i<pays.length; i++) {
			pays[i] = new WeekPay(); 
		}
	}
	
	public void append() {
		System.out.print("�̸� : ");
		pays[count].name = sc.next();

		System.out.print("�޿��ܰ� : ");
		pays[count].per_pay = sc.nextInt();
		
		System.out.print("�ٹ��ð� : ");
		pays[count].work_time = sc.nextInt();
		
		count++;
	}
	
	public void output() {
		
		for(int i=0; i<count;i++) {
			pays[i].process();
			pays[i].output();
		}
	}
	
	
	public void start() {
		while(true) {
			System.out.println("1. �߰�");
			System.out.println("2. ���");
			System.out.println("0. ����");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				append();
				break;
			case 2:
				output();
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			
			
			
		}
	}

}
