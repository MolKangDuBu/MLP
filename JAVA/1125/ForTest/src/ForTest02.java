import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int Input;
		int sum= 0;
		
		System.out.print("정수 입력 : ");
		Input = sc.nextInt();
		
		for(int i =1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("문제 1.\t1~10합계는 : "+sum);
		sum =0;
		
		for(int i =1; i<=Input;i++) {
			sum +=i;
		}
		System.out.println("문제 2.\t1~"+Input+"합계는 : "+sum);
		
		
		System.out.print("문제 3.\t"+Input+"의 배수 10개 : ");
		for(int i =1; i<=10; i++) {
			System.out.print(Input*i+" ");
		}
		System.out.println();
		
		System.out.println("문제 4.\t알파뱃 대소문자 따로 출력하기");
		for(int i=65; i<91;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		for(int i=97; i<123;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		
		
		
		
	}

}
