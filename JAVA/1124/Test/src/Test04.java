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
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		
		System.out.print("필기(400) 점수를 입력해주세요 : ");
		note = sc.nextInt();
		while(note>400 || 0>note) {
			System.out.print("400점 만점입니다. 다시 입력해주세요. : ");
			note = sc.nextInt();
		}
		
		System.out.print("워드(200) 점수를 입력해주세요 : ");
		word = sc.nextInt();
		while(word>200 || 0>word) {
			System.out.print("200점 만점입니다. 다시 입력해주세요. : ");
			word = sc.nextInt();
		}
		
		System.out.print("프리젠테이션(200) 점수를 입력해주세요 : ");
		pr = sc.nextInt();
		while(pr>200 || 0>pr) {
			System.out.print("200점 만점입니다. 다시 입력해주세요. : ");
			pr = sc.nextInt();
		}
		
		System.out.print("파워포인트(200) 점수를 입력해주세요 : ");
		ppt = sc.nextInt();
		while(ppt>200 || 0>ppt) {
			System.out.print("200점 만점입니다. 다시 입력해주세요. : ");
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
				ranking ="D 재시험 요망";
	
				System.out.println(name+"님의 총점은 "+score+" "+"등급은 "+ranking+"입니다.");
		}
		

		
		
	}

}
