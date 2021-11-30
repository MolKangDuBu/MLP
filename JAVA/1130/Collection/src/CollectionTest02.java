import java.util.ArrayList;

public class CollectionTest02 {
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("����");
		System.out.println(book.getTitle());
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		
		  book = new Book();
	      book.setTitle("�ְ�����");
	      book.setAuthor("������");
	      book.setPrice(14000);
	      list.add( book );
	      
	      book= new Book();
	      book.setTitle("���̼���");
	      book.setAuthor("�̹���");
	      book.setPrice(20000);
	      list.add( book );
	      
	      book= new Book();
	      book.setTitle("�����ѵ���");
	      book.setAuthor("��û��");
	      book.setPrice(21000);
	      list.add( book );

	
		list.add(new Book("��¥��", "ä����", 17000));
		
		
		for(Book b:list) {
			System.out.println(b.toString());
//			System.out.println(b.getAuthor());
//			System.out.println(b.getPrice());
//			System.out.println();
		}
		
		int pos = list.indexOf(new Book("��¥��", "ä����", 17000));
		System.out.println(pos);
		
		book =new Book("���", "������", 10000);
		Book book2;
		
		book2 = book.copy();
		
		book.setTitle("������");
		System.out.println(book);
		System.out.println(book2);
		
		
		System.out.println(book == book2);
		
		
		
		String s1 = new String("school");
		String s2 = new String("school");
		
		String s3 = "school";
		String s4 = "school";
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		book = new Book("�ڹ��� ����", "���ü�", 35000);
		book2 = new Book("�ڹ��� ����", "���ü�", 35000);
		System.out.println(book.equals(book2));
		
	}

}


class Book{
	private String title;
	private String author;
	private int price;
	
	
	public Book() {
		
	}
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" "+author+" "+price;
	}
	
	public Book copy() {
		Book temp = new Book();
		temp.title = this.title;
		temp.author = this.author;
		temp.price = this.price;
		return temp;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book book = (Book)obj;
		return this.title.equals(book.title);
	}
}
