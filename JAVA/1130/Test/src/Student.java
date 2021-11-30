
public class Student {
	String name ="";
	String s_JungDap ="";
	String answer = "";
	int num_answer =0;
	int total =0;
	
	public void Student() {
		
	}
	
	

	public void setNum_answer(int num_answer) {
		this.num_answer += num_answer;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setS_JungDap(String s_JungDap) {
		this.s_JungDap += s_JungDap;
	}	
	public void setAnswer(String answer) {
		this.answer += answer;
	}
	public void setTotal(int total) {
		this.total += total;
	}



	public String getName() {
		return name;
	}
	
	public String getS_JungDap() {
		return s_JungDap;
	}
	
	public String getAnswer() {
		return answer;
	}
	public int getNum_answer() {
		return num_answer;
	}
	public int getTotal() {
		return total;
	}


	
}
