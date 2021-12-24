package javaProject2;

public class Magazine extends Book{

	int month;
	String MagazTitle;
	
	public Magazine() {

	}
	public Magazine(int MagazNo, String MagazTitle, String MagazName, int MagazPrice, int MagazYear, String MagazPublisher, int month){
		// TODO Auto-generated constructor stub
		super(MagazNo, MagazName, MagazPrice, MagazYear, MagazPublisher);
		this.month = month;
		this.MagazTitle = MagazTitle;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s%03d \t%4s \t%s \t%-10d %-10d \t%-10s \t%-10d",
				"M",this.getBookNo(), this.MagazTitle, this.getBookAuthor(), this.getBookPrice(), this.getBookYear(), this.getBookPublisher(), this.getMonth());
	}


	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getMagazTitle() {
		return MagazTitle;
	}

	public void setMagazTitle(String magaName) {
		this.MagazTitle = magaName;
	}
	
	

}
