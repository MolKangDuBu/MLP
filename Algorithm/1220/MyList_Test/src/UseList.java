
public class UseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList<Dictionary> list = new MyList<Dictionary>();
		list.insertTail(new Dictionary("rain", "��"));
		list.insertTail(new Dictionary("home", "��"));
		list.insertTail(new Dictionary("way", "��"));
		
		MyDicManager mm = new MyDicManager();
		mm.display();
		mm.find();
		
	
	}
}
