package 순차검색;

import java.util.Scanner;

public class UseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>();
		UseStack us =new UseStack();
		us.Reverse(sc.nextLine());
		
//		s.push("A");
//		s.push("B");
//		s.push("C");
//		s.push("D");
//		s.push("E");
//		
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		System.out.println(s.pop());
//		
	}
	
	public void Reverse(String s) {
		Stack<Character> stk = new Stack<Character>();
		char[] c= s.toCharArray();
		
		for(char r:c) {
			stk.push(r);
		}
		while(!stk.isEmpty()) {
			System.out.print(stk.pop());
		}
	}
	

}
