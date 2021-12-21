package 퀵정렬;

import java.util.Scanner;

public class QuickSort {
	
	public static int []nums = new int[]{13, 1, 15, 17, 6, 9, 8, 7, 4, 11};
	
	static void display(int []nums, int start, int end) {
			for(int i =start; i<=end;i++) {
				System.out.printf("%-3d", nums[i]);
			}
			System.out.println();
	}
	
	//퀵정렬은 재귀호출을 사용하는 알고리즘
	static void quicksort(int []nums, int start, int end) {
		if(start>=end)return;
		int key, left, right;
		key =start;
		left = start+1;
		right= end;
		
		while(left<=right) {
			while( left<=end&&nums[left] < nums[key] ) left++;
			while(right>=start &&nums[right]>nums[key])right--;
			
			if(left<=right) {
				int temp=nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}else {
				int temp=nums[key];
				nums[key] = nums[right];
				nums[right] = temp; 
			}
		}
//	display(nums, 0, right-1);
//	System.out.println();
//	display(nums, right+1, end);
	
	quicksort(nums, start, right-1);
	quicksort(nums, right+1, end);
	
	
		
	}
	public static void main(String[] args) {
		//display(nums, 0, 9);
//		quicksort(nums, 0, 9);
//		display(nums, 0, 9);
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 숫자는 ? : ");
		int count = sc.nextInt();
		nums= new int[count];
		
		for(int i =0; i<count;i++) {
			System.out.print("성적 : ");
			nums[i]= sc.nextInt();
		}
		
		quicksort(nums, 0, count-1);
		display(nums, 0, count-1);
	}
}
