import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int Input;
		int sum= 0;
		
		System.out.print("���� �Է� : ");
		Input = sc.nextInt();
		
		for(int i =1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("���� 1.\t1~10�հ�� : "+sum);
		sum =0;
		
		for(int i =1; i<=Input;i++) {
			sum +=i;
		}
		System.out.println("���� 2.\t1~"+Input+"�հ�� : "+sum);
		
		
		System.out.print("���� 3.\t"+Input+"�� ��� 10�� : ");
		for(int i =1; i<=10; i++) {
			System.out.print(Input*i+" ");
		}
		System.out.println();
		
		System.out.println("���� 4.\t���Ĺ� ��ҹ��� ���� ����ϱ�");
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