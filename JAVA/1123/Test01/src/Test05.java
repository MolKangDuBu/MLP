import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {//number 10
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		final int Kimchi = 5000, meat = 6000, soup = 4000;
		int k, m,s;
		System.out.print("��ġ�? ");
		k = sc.nextInt();
		System.out.print("�����? ");
		s = sc.nextInt();
		System.out.print("��������? ");
		m = sc.nextInt();
		
		System.out.println("������ �ݾ� : "+(k*Kimchi+m*meat+s*soup)+" 1�δ� ������ �ݾ� :"+ (k*Kimchi+m*meat+s*soup)/5);
		
	}

}
