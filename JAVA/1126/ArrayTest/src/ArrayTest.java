import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum =0;
		for(int i =0; i<num.length;i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			num[i] = sc.nextInt();
			sum+=num[i];
		}
		
		for(int i =0; i<num.length;i++) {
			System.out.print(num[i]+ " ");
		}
		
		System.out.print("��� ������ "+(sum/num.length));
	}
}
