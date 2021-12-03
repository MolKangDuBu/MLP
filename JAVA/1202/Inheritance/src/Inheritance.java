import java.util.ArrayList;

//생성자는 클래스 내부의 변수들을 초기화하기 위해 만듬
//사용자가 클래스를 정의만 하고 생성자를 안만들면 시스템이 기본 생성자는 만들어 호출
class Cars{
	int speed;
	
	public Cars() {
		super();//부모 생성자 호출- Object 클래스 호출
		System.out.println("parent default constructor");
	}
	//부모 클래스의 생성자를 호출하는 경우는 부모클래스 생성작 ㅏ여러개고 하는 일도 많아서 그 중에서 선택해서 호출하고자 할때
	//메서드의 반드시 첫줄
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
		
		//부모객체의 참조로 자식객체를 참조할 수 있다.
		c1 = sc;// Car <- SportsCar 객체를 저장(자식이 부모의 형태로 전환, 업캐스팅)
				//자식 클래스에서 추가한 내용은 못봄
				//업캐스팅을 통해 override의 경우 부모의 메서드를 그대로 사용불가하기에 업캐스팅을 통해 타입을 맞춘다..?
		//sc = new Cars(); //자식 객체는 참조로 부모 객체 참조가 안됨
		sc = (SportsCars)c1;//강제 형변환을 해야 가능함
		//upcasting 항상 가능 downcasting 예외적 허용
		
		
		ArrayList list = new ArrayList();
		list.add(new Cars(100));
		list.add(new Cars(100));
		list.add(new Cars(100));
		
		for(int i =0; i<list.size();i++) {
			Cars temp = (Cars)list.get(i);
			System.out.println(temp.getSpeed());
		}
	}
}
