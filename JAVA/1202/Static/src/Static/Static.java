package Static;

import java.util.Scanner;

class Counter{
	int x=0;
	static int count = 0;

	public static void displayCount() {
	//	System.out.println(x);
	//	System.out.println(this.x);
	//	System.out.println(this.count);
		System.out.println(count);
	}


}



//객체가 없어도 접근 가능
//객체간에 공유

//static 메서드는 static이 붙지 않은 변수나 함수는 사용불가
//인스턴스 변수사용불가 인스턴스 함수 호출불가
// this참조자를 사용할 수 없다. this는 개체를 만들어야 사용가능


public class Static {
	public static void main(String[] args) {
//		Counter c1= new Counter();
//		c1.x++;
//		c1.count++;
//		
//		c1=new Counter();
//		c1.x++;
//		c1.count++;
//		
//		c1=new Counter();
//		c1.x++;
//		c1.count++;
//		
//		c1=new Counter();
//		c1.x++;
//		c1.count++;
//		
//		System.out.println(c1.x);
//		System.out.println(c1.count);
//		System.out.println(Counter.count);
		
		

		System.out.println(MyUtil.isAlpha('a'));
		System.out.println(MyUtil.isDigit('a'));
		System.out.println(MyUtil.toUpper('a'));
		System.out.println(MyUtil.toLower('a'));
		System.out.println(MyUtil.parseInt("1234")+MyUtil.parseInt("1234"));
		
		
		
		
		
		
	}
}
