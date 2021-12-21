package 정렬;

class Sort{
	int []nums;
	
	void init() {
		nums = new int[] {3, 1, 9, 8, 6, 7, 5, 4, 2, 10};
	}
	
	void display() {
		for(int n : nums) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}
	
	
	void display(int []nums) {
		for(int n : nums) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}
	void selectSort1() {
		System.out.println("정렬중...............................");
		for(int i =0; i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.printf("%3d 회: ", (i+1));
			display();
		}
		System.out.println("정렬완료...............................");
	}
	
	
	
	
	void selectSort2() {
		System.out.println("정렬중...............................");
		int min, pos;
		for(int i =0; i<nums.length-1;i++) {
			min = nums[i];
			pos =i;
			for(int j=i+1;j<nums.length;j++) {
				if(min>nums[j]) {
					min = nums[j];
					pos = j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[pos];
			nums[pos]= temp;
			System.out.printf("%3d 회: ", (i+1));
			display();
		}
		System.out.println("정렬완료...............................");
	}
	
	
	public void bubblesort() {
		System.out.println("정렬중...............................");
		for(int i=0;i<nums.length;i++) {
			for(int j =0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]= nums[j+1];
					nums[j+1]= temp;
				}
				
			}
			System.out.printf("%3d 회: ", (i+1));
			display();
		}
		System.out.println("정렬완료...............................");
	}
	
	
	public void bubblesort2() {
		boolean flag = false;
		System.out.println("정렬중...............................");
		for(int i=0;i<nums.length;i++) {
			flag= false;
			for(int j =0;j<nums.length-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					flag= true;
					int temp = nums[j];
					nums[j]= nums[j+1];
					nums[j+1]= temp;
				}
				
			}
			if(flag==false)
				break;
			System.out.printf("%3d 회: ", (i+1));
			display();
		}
		System.out.println("정렬완료...............................");
	}
	
	
	void insertionSort() {
		int i,j;
		for(i =1; i<nums.length; i++) {
			int temp = nums[i];//위치 찾을 변수값을 tmep에 저장함
			//i번째 위치부터 0에 도달할때까지
			for(j =i; j>0 &&nums[j-1]>temp;j--) {
				nums[j] = nums[j-1];
			}
			
			nums[j]=temp; //들어갈 위치에 삽입
			display();
		}
	}
		
	
	void quicksort(int []arr, int start, int end) {
	
		if(start>=end)return;
		int key = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			while(left<=end&&arr[left]<=arr[key])left++;
			while(right >start &&arr[right]>=arr[key])right--;
			
			if(left <=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}else {
				int temp = arr[right];
				arr[right] = arr[key];
				arr[key] = temp;
			}
		}
		
		display(arr);
		quicksort(arr, start, right-1);
		quicksort(arr, right+1, end);
	}
	
	
}




public class SortMain {
	public static void main(String[] args) {
		Sort sort = new Sort();
//		sort.init();
//		sort.display();
//		sort.selectSort1();
//		sort.display();
//		
//		sort.init();
//		sort.selectSort2();
//		sort.display();
//		
//		sort.init();
//		sort.bubblesort();
//		sort.display();
//		
//		
//		sort.bubblesort2();
//		sort.display();
		sort.init();
		sort.insertionSort();
		
//		int []nums = new int [] {40, 11, 15, 1, 12, 75, 5, 86, 89, 57};
//		sort.quicksort(nums, 0, nums.length-1);
	}
	
}
