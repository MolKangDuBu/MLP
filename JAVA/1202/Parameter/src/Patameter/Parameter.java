package Patameter;



class MyType{
	int x;
	int y;
	public MyType() {}
	
	public MyType(int x, int y) {
		this.x =x;
		this.y = y;
	}
}








public class Parameter {
	
	void display(int x, int y) {
		System.out.printf("x=%d y=%d\n",x ,y);
	}
	
	public void add(int x, int y) {
		x = x*2;
		y = y*2;
	}
	
	
	public void add2(Integer x, Integer y) {
		x= x*2;
		y =y*2;
	}
	
	public void add(MyType m) {
		m.x *=2;
		m.y *=2;
	}
	
	public static void main(String[] args) {
		int x = 10, y = 20;
		Parameter obj = new Parameter();
		obj.add(x, y);
		obj.display(x, y);
		
		obj.add2(x,y);
		obj.display(x, y);
		
		MyType m1 = new MyType(10,20);
		obj.add(m1);
		System.out.println(m1.x+" "+m1.y);
	}
}
