
public class MethodTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest02 mt2 = new MethodTest02();
		Person p1 = new Person();
		
		p1.name = "ȫ�浿";
		p1.phone = "010-0000-0000";
		p1.address = "���ʱ� ���ﵿ";
		
		System.out.println(p1.name);
		System.out.println(p1.phone);
		System.out.println(p1.address);

		Person []ps = new Person[3];
		
		ps[0] = new Person();
		ps[0].name = "�Ӳ���";
		ps[0].phone = "������";
		ps[0].address = "010-454-4545";
		
		System.out.println(ps[0].name);
		System.out.println(ps[0].phone);
		System.out.println(ps[0].address);
		
		ps[1] = new Person("asd", 23, "adasd", "0101010");
	
		ps[1].output();
		
		
		ps[2] = new Person();
		ps[2].output();
	}

}

class Person{
	String name;
	String phone;
	String address;
	int age;
	
	public Person(){
		name ="";
		phone = "";
		address = "";
		age = 20;
		System.out.println("������ ȣ��");
		
	}
	
	public Person(String name, int age, String phone, String address){
		this.name =name;
		this.phone = phone;
		this.address = address;
		this.age = age;
		System.out.println("�Ű����� ������ ȣ��");
		
	}
	
	void setPerson(String n, String p , String a) {
		name = n;
		phone = p;
		address =a;
	}
	
	
	void output() {
		System.out.println(name);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(age);
	}
}
