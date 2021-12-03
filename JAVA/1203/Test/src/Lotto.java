import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
	final int MAX = 10;
	Random rd = new Random();
	List<Integer> Lotto_list = new ArrayList<Integer>();
	int temp;
	
	public Lotto() {
		for(int i=0; i<MAX;) {
			temp = rd.nextInt(10)+1;
			if(Lotto_list.indexOf(temp)==-1) {
				Lotto_list.add(temp);
				i++;
			}
			
		}
	}
}
