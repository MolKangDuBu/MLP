
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		for(i=1; i<=10;i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		
		int j;
		for(i=1;i<=10;i++) {
			for(j=1; j<=10;j++) {
				if(j==6) {
					break;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
