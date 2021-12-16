package 이차원배열;

public class T_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]nums = new int[5][4];
		int i, j, k;
		
		k=1;
		for(i =0;i<5;i++) {
			for(j=0;j<4;j++) {
				nums[i][j]= k++;
			}
		}
		
		for(i=0; i<5;i++) {
			for(j=0;j<4;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		nums[0] = new int[] {1,2,3};
		nums[1] = new int[] {10,20,30, 40, 50};
		nums[2] = new int[] {2,4};
		nums[3] = new int[] {3,6 ,9 ,12};
		nums[4] = new int[] {1,2,3,4 ,5};
		
		for(i=0; i<nums.length;i++) {
			for(j=0;j<nums[i].length;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
