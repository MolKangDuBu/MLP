
public class Dictionary {
	String Eng;
	String Kor;
	
	
	public Dictionary(String Eng, String Kor){
		this.Eng = Eng;
		this.Kor = Kor;
	}
	
	public boolean equals(Object obj) {
		Dictionary dic = (Dictionary)obj;
		return this.Eng.equals(dic.Eng);
	}
	
	public String toString() {
		return this.Eng+" : "+this.Kor;
	}

	public String getEng() {
		return Eng;
	}

	public void setEng(String eng) {
		Eng = eng;
	}

	public String getKor() {
		return Kor;
	}

	public void setKor(String kor) {
		Kor = kor;
	}
	
	
	
	
	
}
