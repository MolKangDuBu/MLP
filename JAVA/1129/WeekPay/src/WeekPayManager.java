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
		System.out.print("이름 : ");
		pays[count].name = sc.next();

		System.out.print("급여단가 : ");
		pays[count].per_pay = sc.nextInt();
		
		System.out.print("근무시간 : ");
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
			System.out.println("1. 추가");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				append();
				break;
			case 2:
				output();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
			
		}
	}

}
