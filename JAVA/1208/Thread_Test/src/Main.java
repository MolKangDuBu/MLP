
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt = new MyThread();
	}
	
}

class MyThread extends Thread{
	
	public void run() {
		for(int i =1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
