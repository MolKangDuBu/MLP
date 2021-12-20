
public class UseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList<Dictionary> list = new MyList<Dictionary>();
		list.insertTail(new Dictionary("rain", "ºñ"));
		list.insertTail(new Dictionary("home", "Áý"));
		list.insertTail(new Dictionary("way", "±æ"));
		
		MyDicManager mm = new MyDicManager();
		mm.display();
		mm.find();
		
	
	}
}
