import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, r;
		
		
		System.out.print("두개의 정수를 입력하시오(큰수, 작은수) : ");
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
		
		System.out.println("최대 공약수는 "+x+" 입니다.");
		
	}

}
