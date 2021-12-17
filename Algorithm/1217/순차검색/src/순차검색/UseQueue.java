package 순차검색;

public class UseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Queue<Integer> q = new Queue<Integer>(5);
			
			q.put(1);
			q.put(2);
			q.put(3);
			q.put(4);
			q.put(5);
			q.display();
			
//		while(!q.isEmpty()) {
//			System.out.println(q.get());
//		}
	}

}
