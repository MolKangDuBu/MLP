import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int Input;
		int km, m;
		System.out.print("meter ют╥б : ");
		Input = sc.nextInt();
		km = Input/1000;
		m = Input%1000;
		System.out.println(km+"km "+m+"m");
		
		
	}

}
