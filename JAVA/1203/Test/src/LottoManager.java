import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class LottoManager {

	List<Lotto>list = new ArrayList<Lotto>();


	public void output() {
		Iterator<Lotto> it = list.iterator(); 
		while(it.hasNext()) {
			List<Integer>  l= it.next().Lotto_list;
			System.out.println(l);
		}
		
	}
	
	
	public void start() {
		int i=0;
		while(i++<6) {
			list.add(new Lotto());
			
		}
	}
}


