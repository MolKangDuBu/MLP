import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, r;
		
		
		System.out.print("�ΰ��� ������ �Է��Ͻÿ�(ū��, ������) : ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x<y) {
			r =x;
			x = y;
			y = r;
		}
		
		do {
			r= x%y;
			x=y;
			y=r;
			
		}while(y!=0);
		
		System.out.println("�ִ� ������� "+x+" �Դϴ�.");
		
	}

}