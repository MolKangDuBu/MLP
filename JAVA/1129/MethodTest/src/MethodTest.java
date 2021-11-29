
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodTest mt = new MethodTest();
		mt.displayLine();
		mt.displayLine();
		mt.displayLine();
		mt.displayLine();
		mt.displayLine();
		
		mt.displayLine2(3);
		
		mt.displayLine3(3, 10, '*');
	
	}

	
	public void displayLine() {
		
		System.out.println("============");	
	}
	
	public void displayLine2(int line) {
			
		for(int i =1; i<=line;i++) {
			System.out.println("-------------");
		}
			
	}
	
	
	public void displayLine3(int line, int cnt, char mark) {
		
		for(int i =1; i<=line;i++) {
			for(int j =1; j<=cnt; j++) {
				System.out.print(mark);
			}
			System.out.println();
			
		}
			
	}
	
}
