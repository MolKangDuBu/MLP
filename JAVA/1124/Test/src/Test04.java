import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc = new Scanner(System.in);
		String name;
		int note;
		int word;
		int pr;
		int ppt;
		int score;
		String ranking;
		
		System.out.print("�̸��� �Է����ּ��� : ");
		name = sc.next();
		
		System.out.print("�ʱ�(400) ������ �Է����ּ��� : ");
		note = sc.nextInt();
		while(note>400 || 0>note) {
			System.out.print("400�� �����Դϴ�. �ٽ� �Է����ּ���. : ");
			note = sc.nextInt();
		}
		
		System.out.print("����(200) ������ �Է����ּ��� : ");
		word = sc.nextInt();
		while(word>200 || 0>word) {
			System.out.print("200�� �����Դϴ�. �ٽ� �Է����ּ���. : ");
			word = sc.nextInt();
		}
		
		System.out.print("���������̼�(200) ������ �Է����ּ��� : ");
		pr = sc.nextInt();
		while(pr>200 || 0>pr) {
			System.out.print("200�� �����Դϴ�. �ٽ� �Է����ּ���. : ");
			pr = sc.nextInt();
		}
		
		System.out.print("�Ŀ�����Ʈ(200) ������ �Է����ּ��� : ");
		ppt = sc.nextInt();
		while(ppt>200 || 0>ppt) {
			System.out.print("200�� �����Դϴ�. �ٽ� �Է����ּ���. : ");
			ppt = sc.nextInt();
		}
		score = note+word+pr+ppt;
		
		
		switch(score/200) {
		case 5:
		case 4:
			ranking="A";
			break;
		case 3:
			ranking ="B";
			break;
		case 2:
			ranking = "C";
			break;
		default:
				ranking ="D ����� ���";
	
				System.out.println(name+"���� ������ "+score+" "+"����� "+ranking+"�Դϴ�.");
		}
		

		
		
	}

}