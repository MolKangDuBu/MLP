import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Fun1{
	int calc(int a, int b);//인터페이스 한개만 노출 가능
}

interface Fnc2{
	void showString(String msg);
}

class Book{
	String title ="";
	String author = "";
	
	public Book(String title, String author) {
		this.title = title;
		this.author =author;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title+" "+author;
	}
}



public class LambdaTest {
	public static void main(String[] args) {
		Fun1 f = (x,y) ->{return x+y;};
		
		System.out.println(f.calc(4, 5));
		
		f= (x,y)->{return x*y;};
		System.out.println(f.calc(4, 5));
		
		f= (x,y)->{return x-y;};
		System.out.println(f.calc(4, 5));
		f= (x,y)->{return x/y;};
		System.out.println(f.calc(4, 5));
		
		Fnc2 f2 = msg-> System.out.println(msg);
		f2.showString("Hello");
		
		int []nums = new int[] {3,1,2,5,4,9,8,11,12,34,6,7,15};
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		for(int i =0; i<nums.length; i++) {
			if(nums[i]%2 ==0) {
				evenList.add(nums[i]);
			}else {
				oddList.add(nums[i]);
			}	
		}
		
		for(Integer n  : evenList) {
			System.out.print(n+ " ");
		}
		System.out.println();
		
		//Stream /람다
		Stream<Integer> stm = evenList.stream(); 
		//IntStream stream = Array.stream(nums);
		
		stm.filter((n)->{return n%2==0;}).forEach((n)->{System.out.print(n+" ");});
		System.out.println();
		//true or false를 반환하는 람다함수를 만들어 전달
		
		List<String> sList = Arrays.asList("사과", "바나나", "딸기");
		sList.stream().forEach((item)->{System.out.print(item+" ");});
		System.out.println();

		
		List<String> s2 = Arrays.asList("hospital", "assembly", "ja");
		
		s2.stream().filter((word)->{return word.length()>5;})
		.forEach((word)->{System.out.println(word);});
	
	
		nums = new int[] {5, -3, 11, 0, -2, -1};
		IntStream instm = Arrays.stream(nums);
		instm.filter((num)->{return num<0;})
		.forEach((num)->{System.out.print(num+" ");});
		
		List<Integer> list = Arrays.asList(1,3,0,9,6, 8);
		//정렬, List타입으로 전환필요
		List<Integer>sortlist =list.stream().sorted((x1, x2)->{return x1.compareTo(x2);}).collect(Collectors.toList());
		System.out.println(sortlist);
		list.stream()
				.sorted((x1, x2)->{return x1.compareTo(x2);})
				.forEach(System.out::println);
		
		
		List<Book> bookList = Arrays.asList(new Book("자바", "남궁성"),
				new Book("머신러닝", "ㅁㄴㅇ"),
				new Book("닝", "ㅁㄴㅇ"),
				new Book("신러닝", "ㅁㄴㅇ"),
				new Book("러닝", "ㅁㄴㅇ"));
		bookList.stream().forEach(System.out::println);
		List<Book> bookSort = bookList.stream()
				.sorted((x1, x2)->{return x1.title.compareTo(x2.title);}).toList();
				
		System.out.println();
		bookSort.stream().forEach(System.out::println);
		
		List<Integer> nList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		evenList = nList.stream().filter(n->{return n%2==0;}).toList();
		oddList = nList.stream().filter(n->{return n%2!=0;}).toList();
	
		System.out.println(evenList);
		System.out.println(oddList);
		//filter 
		//map 요소마다 연산처리
		
		List<Integer>aList = nList.stream().map((n)->{return n*2;}).toList();
		System.out.println(aList);
		
		List<String>capList =s2.stream().map((w)->{return w.toUpperCase();}).toList();
		System.out.println(capList);
	}

	
	
}
