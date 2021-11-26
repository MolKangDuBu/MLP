import java.util.Scanner;

public class Tset03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		int selcet;
		int rad, w, h;
		
		System.out.println("1. 원의 면적\n2. 삼각형의 면적\n3. 사각형의 면적");
		selcet  = sc.nextInt();
		
		switch(selcet) {
		case 1:
			System.out.print("반지름 : ");
			rad = sc.nextInt();
			System.out.println("원의 면적은 "+(rad*rad*PI)+"입니다.");
			break;
		case 2:
			System.out.print("밑변 : ");
			w = sc.nextInt();
			System.out.print("높이 : ");
			h = sc.nextInt();
			System.out.println("삼각형의 면적은 "+((w*h)/2)+"입니다.");			
			break;
		case 3:
			System.out.print("가로 : ");
			w = sc.nextInt();
			System.out.print("세로 : ");
			h = sc.nextInt();
			System.out.println("사각형의 면적은 "+(w*h)+"입니다.");			
			break;
		}
		
	}

}
