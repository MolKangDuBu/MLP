
public class Circle extends Shape{

	double rad;

	
	public Circle(double rad){
		this.rad = rad;
	}
	@Override
	public void setSurface() {
		// TODO Auto-generated method stub
		this.surface = (rad*rad)*3.14;
	}

	@Override
	public void setLength() {
		// TODO Auto-generated method stub
		this.length = rad*2*3.14;
	}
	
	

}
