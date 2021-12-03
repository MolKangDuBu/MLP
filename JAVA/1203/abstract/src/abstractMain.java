import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class Person implements Comparable{
	String name;
	String phone;
	String address;
	
	public Person(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub

		Person temp = (Person)o;
		//this.name�� ���������� temp.name���� �տ� ������ -��
		// ������ 0 �ڿ������� +��
		return this.name.compareTo(temp.name);
	}
}




public class abstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list = new LinkedList<String>();
		list.add("������");
		list.add("���̽�");
		list.add("������");
		list.add("����");
		list.add("�ڰ�ġ");
		list.add("�������");
		
		list.sort(null);
		for(String s : list) {
			System.out.println(s);
		}
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("ȫ�浿", "010-0000-000", "asd"));
		personList.add(new Person("ȫ�浿2", "010-0000-1000", "aasd"));
		personList.add(new Person("ȫ�浿3", "010-0000-2000", "basd"));
		personList.add(new Person("ȫ�浿4", "010-0000-3000", "casd"));
		personList.add(new Person("ȫ�浿5", "010-0000-4000", "dasd"));
		
		personList.sort(null);
		
		for(Person s : personList) {
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
		}
		
	}

}
