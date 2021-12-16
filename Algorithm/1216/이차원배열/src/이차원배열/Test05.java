package 이차원배열;

import java.util.Scanner;

class Util{
	
	public static String deciToBin(int value) {
		String result="";
		int mok, nmg;
		mok=value;
		while(mok!=0) {
			nmg= mok%2;
			result += (char)(nmg+'0');
			mok=mok/2;
		}
		
		char[]r = result.toCharArray();
		
		for(int i =0; i<r.length/2;i++) {
			char temp = r[i];
			r[i] = r[(r.length-1)-i];
			r[(r.length-1)-i]=temp;
		}
		
		return String.valueOf(r);
	}
	
	
	public static int BinToDec(String nums) {
		
		int result =0;
		for(int i=0; i<nums.length();i++) {
			result= result*2+nums.charAt(i)-'0';
			
		}
		
		return result;
		
	}
	 
}












public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test05 test = new Test05();
		Util util = new Util();
		int num =sc.nextInt();
		System.out.println(util.deciToBin(num));
		
		System.out.println(util.BinToDec(sc.next()));
		//test.Conversion_TWO(num);
		
	}
	
	
	public void Conversion_TWO(int num) {
		int []T;
		int Temp = num;
		int MAX=0;
		int i =0;
		
		while(Temp>0) {
			Temp/=2;
			MAX++;
		}
		
		Temp =num;
		T =new int[MAX];
		while(Temp>0) {
			T[i++] = Temp%2;
			Temp/=2;	
		}
		
		for(i=MAX-1;i>=0; i--) {
			System.out.print(T[i]+" ");
		}
	}
	
	
}
