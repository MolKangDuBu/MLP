package javaProject2;

public class Book {

	int bookNo;
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	int bookYear;
	String bookPublisher;

	public Book() {
		
	} 
	
	public Book(int bookNo,String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {

		this.bookNo = bookNo;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}
	
	public Book(int bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}
	
	
	@Override
	public String toString() {//
		// TODO Auto-generated method stub
		return String.format("%s%03d \t%4s \t%s \t%-10d %-10d \t%-10s",
				"B",this.bookNo, this.bookTitle, this.bookAuthor, this.bookPrice, this.bookYear, this.bookPublisher);
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public int getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}


	public int getBookYear() {
		return bookYear;
	}


	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}


	public String getBookPublisher() {
		return bookPublisher;
	}


	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	
	
	
}
