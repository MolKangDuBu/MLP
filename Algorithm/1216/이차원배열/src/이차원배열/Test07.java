package �������迭;

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
		
		//�ߺ�üũ
		for(int i =0; i<3;) {
			temp = rn.nextInt(9)+1;
			if(issame!=temp) {
				issame =temp;
				answer += temp;
				i++;
			}
		}
		
		//���� ����
		do{
			System.out.print("num(3�ڸ�) : ");
			String num =sc.next();
			
			if(isNUM(num)) {
				Check(answer, num);
			}else {
				System.out.println("���� �ٸ� ���� 3�ڸ��� �Է����ּ���");
			}
		}while(!isEnd());
		
	}
	//�� üũ
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
			System.out.println(player+"�� "+S+"��Ʈ����ũ "+B+"���Դϴ�.");
			count++;
		}else {
			System.out.println("�����Դϴ�.");
			END=true;
		}
		
		
	}
	//�Է��� ���� 3�ڸ� ���ڰ� �´��� Ȯ��
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
	
	//���� ���Ῡ��
	public boolean isEnd() {
		if(count==7) {
			System.out.println("7�� Ʋ���̽��ϴ�. GAME OVER");
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
