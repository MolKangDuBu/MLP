
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		WeekPay wp = new WeekPay("ȫ�浿", 30, 10000);
//		wp.process();
//		wp.output();
//		
//		
//		WeekPay []pays = new WeekPay[5];
//		pays[0] = new WeekPay("��", 20000, 15);
//		pays[1] = new WeekPay("��", 10000, 30);
//		pays[2] = new WeekPay("��", 30000, 25);
//		pays[3] = new WeekPay("��", 12000, 20);
//		pays[4] = new WeekPay("��", 25000, 25);
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


