import java.util.Scanner;

public class WhileTest02 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int num, even_total=0, odd_total=0;
		int even_count=0, odd_count=0;
		int i =0;
		while(i<=10) {
			System.out.print("???? 10?? ?Է?: ");
			num = sc.nextInt();
			
			if(num%2==0) {
				even_count++;
				even_total+=num;
			}else {
				odd_count++;
				odd_total+=num;
			}
			i++;
				
		}
		
		if(even_count !=0) {
			System.out.println("¦?? ???? : "+even_total/even_count);
			
		}
		if(odd_count!=0){
			System.out.println("Ȧ?? ???? : "+odd_total/odd_count);
			
		}
		
		
	}
}
