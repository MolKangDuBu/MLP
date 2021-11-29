
public class WeekPay {

	String name;
	int per_pay;
	int work_time;
	int base_pay;
	int over_pay;
	int total_pay;
	
	
	public WeekPay() {
		name = "";
		work_time =20;
		per_pay = 10000;
	}


	public WeekPay(String name, int per_pay, int work_time) {
		this.name = name;
		this.per_pay = per_pay;
		this.work_time = work_time;
	
	}
		
	
	public void process() {
		base_pay = per_pay* work_time;
		over_pay = 0;
		if(work_time >20) {
			over_pay = (int)((work_time-20)*per_pay*0.5);
		}
		total_pay = base_pay +over_pay;
	}
	
	public void output() {
		System.out.printf("%s\t", name);
		System.out.printf("%d\t", work_time);
		System.out.printf("%d\t", per_pay);
		System.out.printf("%d\t", base_pay);
		System.out.printf("%d\t", over_pay);
		System.out.printf("%d\t", total_pay);
		System.out.println();
	}
	
}
