

import java.util.Scanner;

public class QuickSort {
	
	public static int []nums = new int[]{13, 1, 15, 17, 6, 9, 8, 7, 4, 11};
	
	static void display(int []nums, int start, int end) {
		int max = end+1;
			for(int i =end; i>=0;i--) {
				System.out.printf("%d등 : %d\n",max-i, nums[i]);
			}
			System.out.println();
	}
	
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
	quicksort(nums, start, right-1);
	quicksort(nums, right+1, end);
	
	
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		nums= new int[count];
		
		for(int i =0; i<count;i++) {
			System.out.printf("학생%d 점수 입력 : ", i+1);
			nums[i]= sc.nextInt();
		}
		
		quicksort(nums, 0, count-1);
		System.out.println("성적순으로 정렬");
		System.out.println();
		display(nums, 0, count-1);
	}
}
