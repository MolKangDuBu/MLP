import java.util.Scanner;

public class Test02 {

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
		
		System.out.print("����(200) ������ �Է����ּ��� : ");
		word = sc.nextInt();
		
		System.out.print("���������̼�(200) ������ �Է����ּ��� : ");
		pr = sc.nextInt();
		
		System.out.print("�Ŀ�����Ʈ(200) ������ �Է����ּ��� : ");
		ppt = sc.nextInt();
		
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
		
//		if(score>=800) {
//			ranking ="A";
//			System.out.println(name+"���� ������ "+score+" "+"����� "+ranking+"�Դϴ�.");
//		}else if(800>score&&score>=600) {
//			ranking ="B";
//			System.out.println(name+"���� ������ "+score+" "+"����� "+ranking+"�Դϴ�.");
//		}else if(600>score&&score>=400) {
//			ranking ="C";
//			System.out.println(name+"���� ������ "+score+" "+"����� "+ranking+"�Դϴ�.");
//		}else if(400>score) {
//			ranking ="D";
//			System.out.println(name+"���� ������ "+score+" "+"����� "+ranking+"�Դϴ�.");
//			System.out.println("����� ���");
//		}
//		
		
		
	}

}
