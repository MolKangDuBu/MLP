import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name= sc.nextLine();
		
		System.out.print("���� " );
		kor = sc.nextInt();
	
		System.out.print("���� " );
		eng = sc.nextInt();

		System.out.print("���� " );
		mat = sc.nextInt();
		
		total = kor+eng+mat;
		avg = total/3.0f;
		
		System.out.println(name+"�� ������ "+total+"�̰� ����� "+avg+"�̴�.");
		
		
	}

}