import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Ŀ��");
		list.add("�����ֽ�");
		list.add("�������ֽ�");
		list.add("�ڸ����̵�");
		list.add("ī��ḶŰ�ƶ�");
	
		System.out.println("������ ī��Ʈ : "+ list.size());
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		int pos = list.indexOf("�����ֽ�");
		System.out.println(pos);
		
		
		pos = list.indexOf("�����ֽ�");
		System.out.println(pos);
		
		list.sort(null);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("---\t����\t---");
		list.remove(1);
		list.remove("ī��ḶŰ�ƶ�");
	
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---\t��ü ����\t---");
		list.clear();
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
