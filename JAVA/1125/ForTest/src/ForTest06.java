import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		for(int i =0; i<10;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		int num =1;
//		for(int i =0;i<10;i++) {
//			for(int j = 0;j<10;j++) {
//				System.out.print(num+ "\t");
//				num++;
//			}
//			System.out.println();
//		}
		
//		int count=0;
//		int num;
//		for(int i ='A'; i<='Z';i++) {
//		
//			for(int j =i;j<='Z';j++) {
//				System.out.printf("%-3c",(char)j);
//				count++;
//			}
//			num = 26-count;
//			for(int k ='A';num>0; num--) {
//				System.out.printf("%-3c", (char)k++);
//			}
//			count =0;
//			System.out.println();
//		}
//		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int max=sc.nextInt();
		System.out.println();
		int count=1;
		for(int i=-1; i<max-1;i++) {
	
			for(int k =0; k<(max*2)-count; k+=2) {
				System.out.print(" ");
			}
	
			for(int j =0; j<count; j++) {
				System.out.print("*");
			}
			count+=2;
			System.out.println();
		}
		
		count-=4;
		
		for(int i =max; i>=-1;i--) {
			for(int k = 0; k<(max*2)-count; k+=2) {
				System.out.print(" ");
			}
			for(int j =count; j>0; j--) {
				System.out.print("*");
			}
			count-=2;
			System.out.println();
		}
		
		
	}

}
