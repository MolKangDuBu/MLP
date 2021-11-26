import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int Input;
		System.out.print("정수 입력 : ");
		Input = sc.nextInt();
		for(int i=1; i<=Input;i++) {
			if(Input%i==0) {
				System.out.print(i+ " ");
			}
		}
	}

}
