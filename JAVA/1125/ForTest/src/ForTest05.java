import java.util.Random;
import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("난수의 개수를 입력해주세요 : ");
		int Input = sc.nextInt();
		int sum=0;
		int random;
		for(int i=0;i<Input;i++) {
			random = rd.nextInt(100);
			sum+=random;
			System.out.print(random+" ");
		}
		System.out.println(": "+sum);
	}

}
