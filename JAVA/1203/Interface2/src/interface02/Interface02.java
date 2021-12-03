package interface02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Book{
	String title="";
	String author = "";
	int price =0;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return this.title+" "+this.author+" "+this.price;
	}
	
	
}

class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}
	
	
}


public class Interface02 {
	public static void main(String[] args) {
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("gd", "gd", 10000));
		book.add(new Book("dfg2", "gd", 10000));
		book.add(new Book("Asd", "gd", 10000));
		
		book.sort(new BookComparator());
//		
//		for(Book b : book) {
//			System.out.println(b.toString());
//		}
		//시스템 내부에서 실제 데이터들의 배치모습이나 순서와 상관없이 클래스밖에서 내부데이터를
		//순서대로 접근하도록 하는 인터페이스, 컬렉션 클래스들은 다 이 인터페이스를 지원
		//for each 구문 처리 가능
		Iterator<Book> it = book.iterator();
		while(it.hasNext()) {
			Book b = it.next();
			System.out.println(b);
		}
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("school", "학교");
		map.put("hospital", "병원");
		map.put("house", "집");
		map.put("company", "회사");
		
		System.out.println(map.get("school"));
		System.out.println(map.get("hospital"));
		System.out.println(map.get("house"));
		System.out.println(map.get("company"));
		
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		for(String key:map.keySet()){
			System.out.println(key+ " "+map.get(key));
		}
	}
}
