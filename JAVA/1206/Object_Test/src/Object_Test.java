
class Parent {
	protected int x;
	 void display() {
		System.out.println("x= "+x);
	
	}
}

class Child extends Parent{
	int y;
	void display() {
		System.out.printf("x = %d y= %d\n",x ,y);
	}
}

public class Object_Test {

}
