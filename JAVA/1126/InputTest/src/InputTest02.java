import java.util.Scanner;

public class InputTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Scanner sc = new Scanner(System.in);
		String s;
		char C;
		int count =0;
		int []Input;
		int []ABC = new int[26];
		
		System.out.println("????");
		s = sc.nextLine();
		
		for(int i=0; i<s.length();i++) {
			if(65<=s.charAt(i)&&s.charAt(i)<91) {
				ABC[s.charAt(i)-'A']++;
			}else if(97<=s.charAt(i)&&s.charAt(i)<123) {
				ABC[s.charAt(i)-'a']++;
			}
		}
		
		for(int i=0; i<ABC.length; i++) {
			System.out.println((char)(i+65)+" ------> "+ABC[i]);
		}
		
		
		
	}

}
