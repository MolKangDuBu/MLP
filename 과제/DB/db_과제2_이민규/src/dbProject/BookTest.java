package dbProject;

import java.util.List;
import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookDAO dao = new BookDAO();
		BookDTO dto = new BookDTO();
		
		System.out.println("(No, Title, Author, Year, Price, Publisher)");
	
	
		dto.setBookNo(sc.next());

		dto.setBookTitle(sc.next());
	
		dto.setBookAuthor(sc.next());
		
		dto.setYear(sc.next());
		
		dto.setPrice(sc.next());
		
		dto.setPublisher(sc.next());

		dao.insertProduct(dto);
		
		
		dao.selectProduct();
		
	}
}
