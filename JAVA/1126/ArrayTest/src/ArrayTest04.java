import java.util.Random;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Random rd = new Random();
//		final int ARRMAX =5;
//		
//		
//		int num[] = new int[ARRMAX];
//		int max;
//		int top;
//		
//		for(int i=0; i<num.length;i++) {
//			num[i]= rd.nextInt(100);
//		}
//		
//		System.out.println("������");
//		for(int i=0; i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();
//		max = num[0];
//		top =1;
//		for(int i=1;i<num.length;i++) {
//			if(max<num[i]) {
//				max=num[i];
//				top =i+1;
//			}
//		}
//		
//		System.out.println("���� ū ���� "+top+"��° ���� "+max+"�Դϴ�.");
//	

		
		
		final int Referee = 10;
		double max,min, avg;
		double sum =0;
		double []score =new double[Referee];
		
		for(int i=0; i<score.length;i++) {
			score[i] = rd.nextDouble()+rd.nextInt(10)+1;
		}
		
		max=score[0];
		min = score[0];
		
		for(int i =1; i<score.length;i++) {
			if(max<score[i]) max = score[i];
			if(min>score[i]) min = score[i];
		}
		
		
		for(int i =1; i<score.length; i++) {
			sum+=score[i];
		}
		
		for(int i =0; i<score.length;i++) {
			System.out.printf("%.2f ", score[i]);
		}
		
		System.out.println();
		avg = (sum-(max+min))/(Referee-2);
		System.out.printf("����� %.2f",avg);
		
	}

}