import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name= sc.nextLine();
		
		System.out.print("국어 " );
		kor = sc.nextInt();
	
		System.out.print("영어 " );
		eng = sc.nextInt();

		System.out.print("수학 " );
		mat = sc.nextInt();
		
		total = kor+eng+mat;
		avg = total/3.0f;
		
		System.out.println(name+"의 총점은 "+total+"이고 평균은 "+avg+"이다.");
		
		
	}

}
