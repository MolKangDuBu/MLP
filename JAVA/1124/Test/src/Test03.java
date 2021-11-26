import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		double m = sc.nextDouble();
		
		if(m<5.0) {
			System.out.println("경미하거나 거의 피해 없음");
		}else if(5.0<=m &&m<5.5) {
			System.out.println("약간의 피해");
		}else if(5.5<=m&&m<6.5) {
			System.out.println("중대한 피해, 벽이 부서지거나 떨어짐");
		}else if(6.5<=m && m<7.5) {
			System.out.println("재해, 집 또는 건물이 붕괴될 수 있음");
		}else{
			System.out.println("재앙, 대부분의 건물이 붕괴됨");
		}
		
		
	}

}
