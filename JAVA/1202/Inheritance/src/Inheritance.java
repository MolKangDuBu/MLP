import java.util.ArrayList;

//�����ڴ� Ŭ���� ������ �������� �ʱ�ȭ�ϱ� ���� ����
//����ڰ� Ŭ������ ���Ǹ� �ϰ� �����ڸ� �ȸ���� �ý����� �⺻ �����ڴ� ����� ȣ��
class Cars{
	int speed;
	
	public Cars() {
		super();//�θ� ������ ȣ��- Object Ŭ���� ȣ��
		System.out.println("parent default constructor");
	}
	//�θ� Ŭ������ �����ڸ� ȣ���ϴ� ���� �θ�Ŭ���� ������ ���������� �ϴ� �ϵ� ���Ƽ� �� �߿��� �����ؼ� ȣ���ϰ��� �Ҷ�
	//�޼����� �ݵ�� ù��
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
		
		//�θ�ü�� ������ �ڽİ�ü�� ������ �� �ִ�.
		c1 = sc;// Car <- SportsCar ��ü�� ����(�ڽ��� �θ��� ���·� ��ȯ, ��ĳ����)
				//�ڽ� Ŭ�������� �߰��� ������ ����
				//��ĳ������ ���� override�� ��� �θ��� �޼��带 �״�� ���Ұ��ϱ⿡ ��ĳ������ ���� Ÿ���� �����..?
		//sc = new Cars(); //�ڽ� ��ü�� ������ �θ� ��ü ������ �ȵ�
		sc = (SportsCars)c1;//���� ����ȯ�� �ؾ� ������
		//upcasting �׻� ���� downcasting ������ ���
		
		
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
