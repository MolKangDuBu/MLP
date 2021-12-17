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
		System.out.println("대기번호는 현재"+q.MAX()+"번이며 대기중인 사람은 "+(q.Count())+"명 입니다."+
							"대기 시간은 "+q.Count()*2+"분입니다.");
	}
	
	public void Manager() {
		if(q.isEmpty()) {
			System.out.println("대기중인 손님이 없습니다.");
		}else {
			System.out.println((q.MIN()+1)+"번 손님 창구 앞으로 와주세요");
			q.get();
		}
		
	}
	
	
	public void Display() {
		System.out.println("은행 번호표 뽑기");
		System.out.println("------------------");
		
		while(Run) {
			System.out.println("1. 손님\n2. 은행원\n0. 종료");
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
