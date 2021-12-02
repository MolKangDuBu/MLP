



class Cars{
	int speed;
	
	public Cars() {
		super();
		System.out.println("parent default constructor");
	}
	public Cars(int speed) {
		super();
		this.speed = speed;
		System.out.println("parent parameter constructor");
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}


class SportsCars extends Cars{

	boolean turbo;
	
	public SportsCars() {
		this.turbo = true;
		System.out.println("child default constructor");
	}
	
	public SportsCars(int speed, boolean turbo) {
		super(200);
		this.speed = speed;
		this.turbo = turbo;
		System.out.println("child parameter constructor");
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
}


public class Inheritance{
	public static void main(String[] args) {
		
		Cars c1 = new Cars();
		c1.setSpeed(100);
		System.out.println(c1.getSpeed());
		
		SportsCars sc  = new SportsCars();
		sc.setSpeed(200);
		
		System.out.println(sc.getSpeed());
		sc.turbo = true;
		System.out.println(sc.turbo);
		
		System.out.println("===========================");
		SportsCars sc2 = new SportsCars(160, true);
	
	}
}
