import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		Scanner sc = new Scanner(System.in);
		
		number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
		
	}

}
