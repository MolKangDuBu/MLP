package S_Array;

public class MyArray {
	private int []nums;
	private int capacity =10;
	
	
	public MyArray() {
		nums = new int[10];
	}
	
	public MyArray(int size) {
		if(size <5) {
			capacity =5;
		}else {
			capacity = size;
		}
		nums= new int[capacity];
	}
	
	public void setValue(int index, int value) {
		if(index<0||index>=capacity) {
			return;
		}
		nums[index] = value;
	}
	
	public int getValue(int index) {
		
		if(index<0||index>=capacity) {
			return -1;
		}
		return nums[index];
	}
}
