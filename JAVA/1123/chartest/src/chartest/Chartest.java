package chartest;

public class Chartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		c = 'A';
		
		String word = "�ܾ�";
		System.out.println(word);
		
		System.out.println("������\n������");
		System.out.println("������\b������");
		System.out.println("������\r\n������");
		
		System.out.println("������//������");
		System.out.println("\"������ \"������");
		System.out.println("\'������ \'������");
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'1');
		
		c = '\u0041';
		System.out.println(c);
		
		boolean b;
		b = true;
		System.out.println(b);
		
		b= false;
		System.out.println(b);
		
		b=1>2;
		System.out.println(b);
		
		
	}

}
