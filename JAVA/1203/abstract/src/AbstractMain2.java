
public class AbstractMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = new Rectangle(7, 8);
		Circle circle = new Circle(7);
		triangle tg = new triangle(7, 8);
		shape1.setLength();
		shape1.setSurface();
		circle.setSurface();
		circle.setLength();;
		tg.setSurface();
		System.out.println(shape1.getSurface());
		System.out.println(shape1.getLength());
		System.out.println(circle.getSurface());
		System.out.println(circle.getLength());
		System.out.println(tg.getSurface());
		
	}

}
