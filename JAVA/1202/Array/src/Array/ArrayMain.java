package Array;

import java.util.Scanner;

class MyUtil{
	
	Scanner sc = new Scanner(System.in);
		
	public int MaxValue(int []nums) {
		int pos=-1;
		int MAX=0;
		
		for(int i=0;i<nums.length;i++) {
			if(MAX<nums[i]) {
				MAX =nums[i];
				pos=i+1;
			}
		}
		return pos;
		
	}
	
	public double AvgValue(int []nums) {
		int sum=0;
		int avg=0;
		for(int i:nums) {
			sum+=i;
		}
		avg = sum/nums.length;
		return (double)avg;
	}
	
	public void readArray(int []nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%d번째 ", i+1);
			nums[i]= sc.nextInt();
		}
	}
	
	public void writeArray(int []nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%4d", nums[i]);
		}
		System.out.println();
	}
}







public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil mu = new MyUtil();
		int []a= new int[10];
		mu.readArray(a);
		mu.writeArray(a);
		System.out.println("가장 큰 수는 "+mu.MaxValue(a)+"번째");
		System.out.println(mu.MaxValue(new int[] {2,3,1,5,8,9,7,11}));
		System.out.println(mu.AvgValue(a));
	}

}
