package constantTest;

import java.util.Scanner;

public class ConstantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		final double KM_PER_MILE= 1.609344;
		double km;
		System.out.print("���� : ");
		double mile=sc.nextDouble();
		
		km = mile*KM_PER_MILE;
		
		System.out.println(mile+"������ "+km+" ų�ι��� �Դϴ�.");
		
	}

}
