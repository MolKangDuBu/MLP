
public class Exception_Test {
	public static void main(String[] args) {
	
		int []nums = new int[3];
		
		try {
			nums[0] =10;
			nums[1] =20;
			nums[2] =30;
			nums[3] =40;	
		}catch(Exception e) {
			System.out.println(e);
		}
		finally{//오류가 발생하던 안하던 꼭 실행됨
			System.out.println("Hi lol");
		}
		
	}
}
