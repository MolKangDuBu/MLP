import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("온도를 입력해주세요: ");
		float Input = sc.nextFloat();
		float degree= (float)((Input*1.8)+32);
		System.out.println(degree);
		
	}

}
