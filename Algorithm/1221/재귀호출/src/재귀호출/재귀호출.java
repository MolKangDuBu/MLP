package ¿Á±Õ»£√‚;


class Recurive{
	
	
	void display(int limit) {
		if(limit ==0)return;
		
		System.out.println(limit);
		display(limit-1);
	}
	
	void display2(int limit) {
		if(limit ==0)return;
		display2(limit-1);
		System.out.println(limit);
		
	}
	
	
	int factorial(int limit) {
		if(limit==1)return 1;
		else return limit*factorial(limit-1);
	}
}


public class ¿Á±Õ»£√‚ {
	public static void main(String[] args) {
		Recurive rs = new Recurive();
		rs.display(10);
		rs.display2(10);
		
		System.out.println(rs.factorial(5)); 
	}

}
