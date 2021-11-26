import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI=3.141592f;
		float radius;
		float surface;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		radius =sc.nextFloat();
		surface = radius*radius*PI;
		
		System.out.println("원의 면적은 "+ surface);
		sc.close();
	}

}
