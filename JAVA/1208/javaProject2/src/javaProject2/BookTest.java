package javaProject2;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book>Book_List = new ArrayList<Book>();
		List<Magazine>Maga_List = new ArrayList<Magazine>();
		
		Book_List.add(new Book(001, "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사"));
		Book_List.add(new Book(002, "자바스크립트", "이몽룡", 30000, 2020, "서울출판사"));
		Book_List.add(new Book(003, "HTML/CSS", "성춘향", 18000, 2021, "강남출판사"));
		
		System.out.printf("%s \t%s \t\t%-6s %s \t%6s \t%3s\n","도서번호", "도서명", "저자", "가격", "발행일", "출판사");
		System.out.println("------------------------------------------------------------------------");
		for(Book b: Book_List) {
			System.out.println(b.toString());
		}
		
		
		Maga_List.add(new Magazine(001, "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5));
		Maga_List.add(new Magazine(002, "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7));
		Maga_List.add(new Magazine(003, "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9));
		
		System.out.println();
		System.out.printf("%s \t%s \t%-6s %s \t%7s \t%3s \t%11s\n","잡지번호", "잡지명", "빌행인", "가격", "발행연도", "출판사", "발행월");
		System.out.println("------------------------------------------------------------------------");
		for(Magazine m: Maga_List) {
			System.out.println(m.toString());
		}
			
			
		
	}

}
