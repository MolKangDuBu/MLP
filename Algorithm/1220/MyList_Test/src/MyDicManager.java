
import java.util.Iterator;

public class MyDicManager {
   MyList<Dictionary> list = new MyList<Dictionary>();
   
   
   
   public MyDicManager()
   {
      list.insertTail(new Dictionary("rain", "ºñ"));
      list.insertTail(new Dictionary("cloud", "±¸¸§"));
      list.insertTail(new Dictionary("flower", "²É"));
      list.insertTail(new Dictionary("bear", "°õ"));
      list.insertTail(new Dictionary("rabbit", "Åä³¢"));
      list.insertTail(new Dictionary("snow", "´«»ç¶÷"));
   }
   
   public void display()
   {
	   Iterator<Dictionary>it = list.iterator();
      while(it.hasNext()) {
    	System.out.println(it.next());  
      }
	   
   }
   
   public void find()
   {
      Dictionary dic = new Dictionary("bear", "");
      
      dic = list.find(dic);
      if (dic != null)
         System.out.println(dic);
      else
         System.out.println("not found");
   }
}