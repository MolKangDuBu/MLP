
public class triangle extends Shape{

	double x;
	double y;
	
	
	public triangle(double x, double y) {
		this.x = x;
		this.y =y;
	}
	
	
	
	@Override
	public void setSurface() {
		// TODO Auto-generated method stub
		this.surface =(x*y)/2;
	}

	@Override
	public void setLength() {
		// TODO Auto-generated method stub
		
	}

}
