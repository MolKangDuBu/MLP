import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

interface Fun1{
	int calc(int a, int b);//昔斗凪戚什 廃鯵幻 葛窒 亜管
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
		
		//Stream /寓陥
		Stream<Integer> stm = evenList.stream(); 
		//IntStream stream = Array.stream(nums);
		
		stm.filter((n)->{return n%2==0;}).forEach((n)->{System.out.print(n+" ");});
		System.out.println();
		//true or false研 鋼発馬澗 寓陥敗呪研 幻級嬢 穿含
		
		List<String> sList = Arrays.asList("紫引", "郊蟹蟹", "京奄");
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
		//舛慶, List展脊生稽 穿発琶推
		List<Integer>sortlist =list.stream().sorted((x1, x2)->{return x1.compareTo(x2);}).collect(Collectors.toList());
		System.out.println(sortlist);
		list.stream()
				.sorted((x1, x2)->{return x1.compareTo(x2);})
				.forEach(System.out::println);
		
		
		List<Book> bookList = Arrays.asList(new Book("切郊", "害叡失"),
				new Book("袴重君閑", "けいし"),
				new Book("閑", "けいし"),
				new Book("重君閑", "けいし"),
				new Book("君閑", "けいし"));
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
		//map 推社原陥 尻至坦軒
		
		List<Integer>aList = nList.stream().map((n)->{return n*2;}).toList();
		System.out.println(aList);
		
		List<String>capList =s2.stream().map((w)->{return w.toUpperCase();}).toList();
		System.out.println(capList);
	}

	
	
}
