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
		//this.name이 사전순서상 temp.name보다 앞에 있으면 -값
		// 같으면 0 뒤에있으면 +값
		return this.name.compareTo(temp.name);
	}
}




public class abstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list = new LinkedList<String>();
		list.add("빼빼로");
		list.add("에이스");
		list.add("맛동산");
		list.add("고래밥");
		list.add("자갈치");
		list.add("계란과자");
		
		list.sort(null);
		for(String s : list) {
			System.out.println(s);
		}
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", "010-0000-000", "asd"));
		personList.add(new Person("홍길동2", "010-0000-1000", "aasd"));
		personList.add(new Person("홍길동3", "010-0000-2000", "basd"));
		personList.add(new Person("홍길동4", "010-0000-3000", "casd"));
		personList.add(new Person("홍길동5", "010-0000-4000", "dasd"));
		
		personList.sort(null);
		
		for(Person s : personList) {
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
		}
		
	}

}
