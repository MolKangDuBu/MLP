import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class String_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello Java");
	
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println();
		String s2 = s1.replace("Java", "python");
		System.out.println(s2);
		System.out.println(s1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.compareTo(s2));
		
		int pos = s1.indexOf("Java");
		System.out.println(pos);
		
		pos = s2.indexOf("Java");
		System.out.println(pos);
		
		s1 = "c:\\temp\\test.txt";
		pos = s1.indexOf(".");
		String filename = s1.substring(0,pos);
		String ext = s1.substring(pos+1);
		
		System.out.println(filename+" "+ext);
		
		pos = s1.lastIndexOf("\\");
		String path = s1.substring(0, pos);
		filename = s1.substring(pos+1);
		System.out.println(path+ "        "+filename);
		pos = filename.indexOf(".");
		ext = filename.substring(pos+1);
		System.out.println(filename.substring(0,pos)+"     "+ext);
		
		
		StringBuffer bf= new StringBuffer();
		bf.append("flower");
		bf.append("rainbow");
		bf.append("rain");
		bf.append("cloud");
		bf.append("wind");
		
		System.out.println(bf.toString());
		System.out.println(bf);
		
		bf.setCharAt(0, 'F');
		System.out.println(bf);

		LocalTime lt = LocalTime.now();
		System.out.println("start : "+lt);
		s1 ="";
		for(int i=1; i<=10000;i++) {
			s1 = s1+i;
		}
		System.out.println("종료시간 : "+LocalTime.now());
	
		System.out.println("start : "+LocalTime.now());
	
		bf= new StringBuffer();
		for(int i=1; i<=10000;i++) {
			bf.append(i);
		}
		System.out.println("종료시간 : "+LocalTime.now());
		
		//Wrapper
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		int n = list.get(0);
		System.out.println(n);
	}

}
