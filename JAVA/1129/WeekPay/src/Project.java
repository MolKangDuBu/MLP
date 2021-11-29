
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		WeekPay wp = new WeekPay("홍길동", 30, 10000);
//		wp.process();
//		wp.output();
//		
//		
//		WeekPay []pays = new WeekPay[5];
//		pays[0] = new WeekPay("가", 20000, 15);
//		pays[1] = new WeekPay("나", 10000, 30);
//		pays[2] = new WeekPay("다", 30000, 25);
//		pays[3] = new WeekPay("라", 12000, 20);
//		pays[4] = new WeekPay("마", 25000, 25);
//		
//		for(int i =0; i<pays.length;i++) {
//			pays[i].process();
//		}
//		
//		for(int i=0;i<pays.length;i++) {
//			pays[i].output();
//		}
	
		WeekPayManager wm = new WeekPayManager();
		wm.start();
	
	}

}


