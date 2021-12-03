import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


//객체 복사 인터페이스
class Score implements Cloneable{
	String name ="";
	int kor;
	int eng;
	int total;
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = this.kor+this.eng;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%s %d %d %d", name, kor, eng, total);
	}
	
	
	@Override
	public boolean equals(Object obj) {

		Score s = (Score)obj;
		return this.name.equals(s.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}
	
	
	
	
	
}

class Booksort implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
		// TODO Auto-generated method stub
		return -(o1.total-o2.total);
	}
	
}





public class ObjectClass {
	public static void main(String[] args) {
		Object obj = new Object();
	
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		List<Score> list = new ArrayList<Score>();
		list.add(new Score("a", 90, 80)); //170
		list.add(new Score("b", 50, 80));//130
		list.add(new Score("c", 60, 80));//140
		list.add(new Score("d", 70, 80));//150
		list.add(new Score("f", 100, 80));//180
			
		int pos = list.indexOf(new Score("asd", 0, 0));
		System.out.println(pos);
		
		list.sort(new Booksort());
		Iterator<Score> it = list.iterator();
		while(it.hasNext()) {
			Score s = it.next();
			System.out.println(s);
		}
	}
}
