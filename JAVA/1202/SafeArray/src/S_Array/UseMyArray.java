package S_Array;

public class UseMyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray arr = new MyArray();
		
		arr.setValue(0, 1);
		arr.setValue(10, 1);
		System.out.println(arr.getValue(0));
		System.out.println(arr.getValue(10));
		System.out.println(arr.getValue(100));
		
		int []arr2 = new int[10];
		arr2[10] =111;
		
		MyArray arr3 = new MyArray(30);
		
	}

}
