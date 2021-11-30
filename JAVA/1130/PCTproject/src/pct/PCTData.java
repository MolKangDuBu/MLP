package pct;

public class PCTData {
	private String name ="";
	private int write=0;
	private int word=0;
	private int ppt=0;
	private int spread=0;
	private int total=0;
	private String grade="";
	
	
	public PCTData() {
		
	}


	
	public void caculate() {
		
		total = write+word+ppt+spread;
		
		switch(total/200) {
		case 5:
		case 4: grade="A";break;
		case 3: grade ="B"; break;
		case 2: grade="C"; break;
		default : grade= "D";
		}
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setWrite(int write) {
		this.write = write;
	}
	public void setWord(int word) {
		this.word = word;
	}
	public void setPpt(int ppt) {
		this.ppt = ppt;
	}
	public void setSpread(int spread) {
		this.spread = spread;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

	public String getName() {
		return name;
	}
	public int getWrite() {
		return write;
	}
	public int getWord() {
		return word;
	}
	public int getPpt() {
		return ppt;
	}
	public int getSpread() {
		return spread;
	}
	public int getTotal() {
		return total;
	}
	public String getGrade() {
		return grade;
	}














	
	
	
	
	
	
}