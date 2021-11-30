import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("커피");
		list.add("망고주스");
		list.add("오렌지주스");
		list.add("자몽에이드");
		list.add("카라멜마키아또");
	
		System.out.println("데이터 카운트 : "+ list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		int pos = list.indexOf("망고주스");
		System.out.println(pos);
		
		
		pos = list.indexOf("딸기주스");
		System.out.println(pos);
		
		list.sort(null);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("---\t삭제\t---");
		list.remove(1);
		list.remove("카라멜마키아또");
	
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---\t전체 삭제\t---");
		list.clear();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
