
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count=0;
		for(int i=2000;i<=3000;i++) {
			if(i%100!=0&& i%4==0||i%400==0) {
				count++;
			}	
		}
		
		System.out.println("2000~3000����� ������ �� "+count+"���Դϴ�.");
		
	}

}
