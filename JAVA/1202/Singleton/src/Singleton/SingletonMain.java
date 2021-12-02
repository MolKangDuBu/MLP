package Singleton;

class Singleton{
	
	private Singleton() {}
	
	private static Singleton instance = null;//��ü ������ ������ ����
	
	
	//��ü ������ ��ȯ�� static �޼���
	public static Singleton getInstance() {
		if(instance ==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	int x;//�����ڿ�
	
	
}


public class SingletonMain {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
	}

}
