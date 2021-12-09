package javaProject1;

public class Product {
	int prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMarker;
	
	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMarker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMarker = prdMarker;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format("%03d \t%4s \t% -8d % -3d \t%-5s",
				this.getPrdNo(), this.getPrdName(),this.getPrdPrice(),this.getPrdYear(),this.getPrdMarker());
				
	}

	public int getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}

	public int getPrdYear() {
		return prdYear;
	}

	public void setPrdYear(int prdYear) {
		this.prdYear = prdYear;
	}

	public String getPrdMarker() {
		return prdMarker;
	}

	public void setPrdMarker(String prdMarker) {
		this.prdMarker = prdMarker;
	}
	
	

}
