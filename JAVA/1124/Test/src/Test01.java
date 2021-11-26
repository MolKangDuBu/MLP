import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.print("첫번째 정수 : ");
		x= sc.nextInt();
		System.out.print("두번째 정수 : ");
		y= sc.nextInt();
		
		if(x>y) {
			System.out.println("큰 수는 "+x);
		}else if(x<y) {
			System.out.println("큰 수는 "+y);
		}
	}

}
