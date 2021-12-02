package Static;

public class MyUtil {
	private MyUtil() {
		
	}

	public static boolean isAlpha(char input) {
		
		char c;
		c =input;
		if((65<=c&&c<=90)||(97<=c&&c<=122)) {
			return true;
		}
		return false;
	}
	
	public static boolean isDigit(char input) {
		
		char c;
		c =input;
		if(47<=c&& c<=58) {
			return true;
		}
		return false;
	}
	
	public static char toUpper(char input) {
		
		char c;
		c = input;
		if(97<=c&&c<=122) {
			c= (char) (c-32);
		}
		return c;
	}
	
	public static char toLower(char input) {
		boolean check =true;
		char c;
		c = input;
		if(65<=c&&c<=90) {
			c= (char) (c+32);
		}
		return c;
	}
	
	
	public static int parseInt(String input) {
		
		int sum=0;
		for(int i =0; i<input.length();i++) {
			if(!isDigit(input.charAt(i))) {
				return -1;
			}
		}
		
		for(int i =0; i<input.length();i++) {
			sum = sum*10+input.charAt(i)-'0';
		}
		
		return sum;
	}
	
	
	public static char Conversion(String str) {
		char c;
		c= str.charAt(0);
		
		return c;
		
	}
}
