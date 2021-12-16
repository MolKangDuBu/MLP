package 이차원배열;

import java.util.Random;
import java.util.Scanner;


class BaseBall{
	
	boolean END =false;
	int count=0;
	
	public void Start() {
		
		Random rn =new Random();
		Scanner sc = new Scanner(System.in);
		String answer ="";
		int temp, issame=0;
		
		//중복체크
		for(int i =0; i<3;) {
			temp = rn.nextInt(9)+1;
			if(issame!=temp) {
				issame =temp;
				answer += temp;
				i++;
			}
		}
		
		//게임 시작
		do{
			System.out.print("num(3자리) : ");
			String num =sc.next();
			
			if(isNUM(num)) {
				Check(answer, num);
			}else {
				System.out.println("서로 다른 숫자 3자리를 입력해주세요");
			}
		}while(!isEnd());
		
	}
	//답 체크
	public void Check(String answer, String player) {
		char[] c_answer = answer.toCharArray();
		char[] c_player = player.toCharArray();
		int S=0;
		int B=0;
		for(int i=0; i<c_answer.length;i++) {
			for(int j =0; j<c_player.length; j++) {
				if(c_answer[i]==c_player[j]) {
					if(i==j)S++;
					else B++;
				}
			}
		}
		if(S!=3) {
			System.out.println(player+"은 "+S+"스트라이크 "+B+"볼입니다.");
			count++;
		}else {
			System.out.println("정답입니다.");
			END=true;
		}
		
		
	}
	//입력한 값이 3자리 숫자가 맞는지 확인
	public boolean isNUM(String num) {
		char[] c_num = num.toCharArray();
		if(c_num.length!=3)return false;
		
		for(int i=0;i<c_num.length;i++) {
			if('1'<=c_num[i]&& c_num[i]<='9') {
				return true;
			}else return false;
		}
		return false;	
	}
	
	//게임 종료여부
	public boolean isEnd() {
		if(count==7) {
			System.out.println("7번 틀리셨습니다. GAME OVER");
			return true;
		}
		return END;
	}

	
	
}



public class Test07 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseBall game = new BaseBall();
		game.Start();
		
	}
	

}
