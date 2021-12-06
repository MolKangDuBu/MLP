import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

class Book{
	String title;
	String author;
	String publisher;
	int price;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Book() {
		
	}

	public Book(String title, String author, String publisher, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s\t %s\t %d", title, author, publisher, price);
	}

}



public class Collect_Test {
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("�������ǵ�", "���طѸ�", "���а�����", 10000));
		list.add(new Book("��", "���طѸ�", "���а�����", 12000));
		list.add(new Book("��", "�طѸ�", "���а�����", 13000));
		list.add(new Book("��", "�Ѹ�", "���а�����", 14000));
		list.add(new Book("��", "��", "���а�����", 15000));
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(Book book : list) {
			System.out.println(book);
		}
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		List<Book>programList = new ArrayList<Book>();
		programList.add(new Book("�ڹ�", "���ü�", "��������", 32000));
		programList.add(new Book("���̽�", "���ü�", "��������", 12000));
		programList.add(new Book("C++", "���ü�", "��������", 18000));
		programList.add(new Book("��Ʋ��", "���ü�", "��������", 16000));
		programList.add(new Book("������", "���ü�", "��������", 24000));
		
		for(int i =0; i<programList.size();i++) {
			System.out.println(programList.get(i));
		}
		
		
		
		for(Book b: programList) {
			System.out.println(b);
		}
		
		
		Iterator it2 = programList.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		//������ ���� ���Ͱ� ����
		List<Book> vlist = new Vector<Book>();
		for(int i =0; i <5; i++) {
			vlist.add(new Book("å"+i, "�۰�"+i,"���ǻ�"+i, i*10000));
		}
		
		for(Book b : vlist) {
			System.out.println(b);
		}
		
		vlist = new LinkedList<Book>();
		for(int i =0; i <5; i++) {
			vlist.add(new Book("å"+i, "�۰�"+i,"���ǻ�"+i, i*10000));
		}
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		Map<String, Book>bookMap  = new HashMap<String, Book>();
		bookMap.put("program1", new Book("�ڹ�", "���ü�", "��������", 32000));
		bookMap.put("program2", new Book("��", "���ü�", "��������", 32000));
		bookMap.put("program3", new Book("��", "���ü�", "��������", 32000));
		
		System.out.println(bookMap.get("program1"));
		for(String key: bookMap.keySet()) {
			System.out.println(key+" "+bookMap.get(key));
		}
		
		List<HashMap<String, String>> personList = new  ArrayList<HashMap<String,String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "ȫ�浿");
		map.put("phone", "0100101");
		personList.add(map);
		
		for(int i=0; i<personList.size();i++) {
			HashMap<String, String>temp = personList.get(i);
			System.out.println(temp.get("name")+"  "+temp.get("phone")+" ");
		}
		
	}
}
