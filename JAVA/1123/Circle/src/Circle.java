import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI=3.141592f;
		float radius;
		float surface;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ : ");
		radius =sc.nextFloat();
		surface = radius*radius*PI;
		
		System.out.println("���� ������ "+ surface);
		sc.close();
	}

}
