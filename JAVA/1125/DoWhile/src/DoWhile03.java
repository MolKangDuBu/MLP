import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int result;
		int Input;
		int  i =1;
	
		System.out.print("�� ��? ");
		Input = sc.nextInt();
		
		do {
			System.out.println(Input+" x "+i+" = "+(Input*i));
			i++;
		}while(i<20);
	}

}
