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



//��ü�� ��� ���� ����
//��ü���� ����

//static �޼���� static�� ���� ���� ������ �Լ��� ���Ұ�
//�ν��Ͻ� �������Ұ� �ν��Ͻ� �Լ� ȣ��Ұ�
// this�����ڸ� ����� �� ����. this�� ��ü�� ������ ��밡��


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
