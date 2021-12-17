package 순차검색;



class Search{
	int []nums = new int[] {1,3,5,9,12,15,17,20,33,34};
	
	void display() {
		System.out.println();
		for(int n: nums) {
			System.out.printf("%4d", n);
		}
		System.out.println();
	}
	//Sequential 순차검색/ Linear 선형검색 
	void LinearSearch() {
		int key = 20;
		boolean find = false;
		int i=0;
		while(!find && i<nums.length) {
			if(nums[i]==key)find= true;
			else i++;
		}
		if(find) {
			System.out.printf("%d방에 있습니다.'\n", i);
		}else {
			System.out.println("찾을 수 없습니다.");
		}
	}
	
	
	void BinarySearch() {
		int left =0;
		int right = nums.length;
		int mid;
		int key = 34;
		boolean find = false;
		while(!find) {
			mid = (left+right)/2;
			if(mid==left||right==mid) {
				System.out.println("찾는 값이 없습니다");
				find =true;
			}
			if(key ==nums[mid]) {
				System.out.printf("%d은 %d번째 위치에 있습니다.", key, mid+1);
				find =true;
			}else if(key>nums[mid]) {
				left= mid;
			}else if(key<nums[mid]) {
				right =mid;
			}
		}
		
				
	}
	
}




public class SearchMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search s  = new Search();
		s.display();
		s.LinearSearch();
		s.BinarySearch();
	}

}
