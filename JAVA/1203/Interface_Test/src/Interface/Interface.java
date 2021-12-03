package Interface;

interface Calc{
	int add();
	int sub();
	int mul();
	int div();
}

class CalcImpl implements Calc{

	int x,y;
	
	
	public CalcImpl(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div() {
		// TODO Auto-generated method stub
		return x/y;
	}
	
}

public class Interface {
	public static void main(String[] args) {
		Calc data = new CalcImpl(7, 9);
		System.out.println(data.add());
		System.out.println(data.sub());
		System.out.println(data.mul());
		System.out.println(data.div());
		
	}
}
