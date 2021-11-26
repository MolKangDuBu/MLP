
public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int []s2 = new int[] {10, 20, 30, 40, 50};
			
			int []s3 = {100, 200, 300, 400, 500};
			
			int i;
			for(i =0; i<s2.length;i++) {
				System.out.printf("%4d", s2[i]);
			}
			
			for(i=0; i<s3.length; i++) {
				System.out.printf("%4d", s3[i]);
			}
			
			
			System.out.println();
			
			String []topping = {"페페로니", "올리브", "파인애플", "불고기", "버섯"};
			for(i =0; i<topping.length; i++) {
				System.out.println(topping[i]);
			}
			
			
	}

}
