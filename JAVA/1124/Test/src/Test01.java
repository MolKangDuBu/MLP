import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		System.out.print("ù��° ���� : ");
		x= sc.nextInt();
		System.out.print("�ι�° ���� : ");
		y= sc.nextInt();
		
		if(x>y) {
			System.out.println("ū ���� "+x);
		}else if(x<y) {
			System.out.println("ū ���� "+y);
		}
	}

}
