
public class Rectangle extends Shape{

	
	double width;
	double height;
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y) {
		this.width =x;
		this.height =y;
	}
	
	
	@Override
	public void setSurface() {
		// TODO Auto-generated method stub
		this.surface = this.width * this.height;
		
	}

	@Override
	public void setLength() {
		// TODO Auto-generated method stub
		this.length = (this.width + this.height)*2;
	}

}
