
public class Operator4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 3;
		int y= 4;
		
		System.out.println((x==3)&&(y==7));
		System.out.println((x==4)&&(y==4));
		System.out.println((x==2)&&(y==7));
		System.out.println((x==3)&&(y==4));
		
		
		System.out.println((x==3)||(y==7));
		System.out.println((x==4)||(y==4));
		System.out.println((x==2)||(y==7));
		System.out.println((x==3)||(y==4));
		
		
		System.out.println(!(x==3));
		System.out.println(!(x!=3));
	}

}
