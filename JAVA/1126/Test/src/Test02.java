import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		final int MAX = 20;
		int []dice = new int[20];
		int []number = new int[6];
		
		for(int i =0; i<MAX; i++) {
			dice[i] =rd.nextInt(6)+1;
		}
		
		for(int i=0; i<dice.length; i++) {
			System.out.print(dice[i]+ " ");
			number[dice[i]-1]++;
		}
		
		System.out.println();
		for(int i=0; i<number.length;i++) {
			System.out.println((i+1)+" --> "+number[i]);
		}
		
		
	}

}
