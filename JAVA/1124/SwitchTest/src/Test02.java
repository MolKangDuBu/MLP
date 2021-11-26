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
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		
		System.out.print("필기(400) 점수를 입력해주세요 : ");
		note = sc.nextInt();
		
		System.out.print("워드(200) 점수를 입력해주세요 : ");
		word = sc.nextInt();
		
		System.out.print("프리젠테이션(200) 점수를 입력해주세요 : ");
		pr = sc.nextInt();
		
		System.out.print("파워포인트(200) 점수를 입력해주세요 : ");
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
				ranking ="D 재시험 요망";
	
				System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
		}
		
//		if(score>=800) {
//			ranking ="A";
//			System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
//		}else if(800>score&&score>=600) {
//			ranking ="B";
//			System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
//		}else if(600>score&&score>=400) {
//			ranking ="C";
//			System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
//		}else if(400>score) {
//			ranking ="D";
//			System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
//			System.out.println("재시험 요망");
//		}
//		
		
		
	}

}
