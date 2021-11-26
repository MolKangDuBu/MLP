import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sel;
		Scanner sc = new Scanner(System.in);
		sel =sc.nextInt();
		
		switch(sel) {
			case 1: System.out.println("½ºÅ¸¹÷½º ¸Ó±×ÀÜ ´çÃ·");
			case 2: System.out.println("½ºÅ¸¹÷½º ÅÒºí·¯ ´çÃ·");
			case 3: System.out.println("¶Ñ½æ µş±â ÄÉŸå ´çÃ·");
			case 4: System.out.println("ÀÌµğ¾ß Ä¿ÇÇ¹Í½º ¼¼Æ® ´çÃ·");
			case 5: System.out.println("¸Æ½É È­ÀÌÆ® °ñµå Ä¿ÇÇ¹Í½º ´çÃ·");
			
		}
		
	String s = "test";
	System.out.println("ÇÑ±Û·Î ¼ıÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
	s = sc.next();
	
	switch(s) {
		case "ÀÏ":
			System.out.println("one");
			break;
		case "ÀÌ":
			System.out.println("two");
			break;
		case "»ï":
			System.out.println("three");
			break;
		case "»ç":
			System.out.println("four");
			break;
		
	}
		
	}

}
