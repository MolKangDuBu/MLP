package algorismProject2;

public class Products {
	int productNum;
	String productName;
	Products left;
	Products right;
	
	
	public Products() {
		productNum = 0;
		productName="";
		left =null;
		right =null;
	}
	
	public Products(int num, String name) {
		productNum = num;
		productName = name;
		left =null;
		right =null;
	}
}
