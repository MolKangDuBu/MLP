package Singleton;

class Singleton{
	
	private Singleton() {}
	
	private static Singleton instance = null;//객체 참조를 저장할 변수
	
	
	//객체 참조를 반환할 static 메서드
	public static Singleton getInstance() {
		if(instance ==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	int x;//공유자원
	
	
}


public class SingletonMain {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
	}

}
