import java.util.Random;
import java.util.Scanner;

import javax.tools.Diagnostic;

public class Main_Test {
	final int MAX = 5;
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	int answer;
	int player;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Test mt = new Main_Test();
		mt.Display();
		mt.start();
	}
	

	public void start() {
		int i=0;
		while(i++<MAX) {
			Input();
			if(Check(i))break;
		}
	}
	
	public void Input() {
		System.out.print("정답을 입력해주세요 : ");
		player = sc.nextInt();
		
	}
	
	public boolean Check(int i) {
		
		if(i ==MAX) {
			System.out.println("회수를 초과했습니다.");
			System.out.println("Game Over");
			return true;
		}
		
		if(answer == player) {
			System.out.println("정답입니다!");
		}else if(answer>player) {
			System.out.println("더 큰수를 입력하세요");
		}else if(answer<player) {
			System.out.println("더 작은 수를 입력하세요");
		}
		return answer == player;
	}
	
	
	
	public void Display() {
		System.out.println("  숫자 맞추기 게임(1~10)");
		System.out.println("회수는 5번 제한입니다!");
		System.out.println("------------------");
		System.out.println();
		answer = rd.nextInt(10)+1;
	}
	

}
