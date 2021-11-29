
public class MethodTest {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		System.out.println(mm.add(1, 5));
		
		mm.sub(1, 5);
		
		mm.displayGugu(4);
		
		System.out.println(mm.sigma(10));
		
		System.out.println(mm.isLeap(2000));
		
		int cnt =0;
		for(int i =1; i<=2021; i++) {
			if(mm.isLeap(i))cnt++;
		}
		System.out.println(cnt);
		
		mm.diamondDisplay(10);
	}
}



class MyMethod{
	
	
	
	int add(int x, int y) {
		return x+y;
	}
	
	
	
	void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	
	
	void  displayGugu(int num) {
		for(int i=1; i <=9;i++) {
			System.out.printf("%d x %d = %d\n",num,i,num*i);
		}
	}
	
	
	
	int sigma(int num) {
		int sum =0;
		for(int i=1;i<=num; i++) {
			sum+=i;
		}
		return sum; 
	}
	
	
	
	boolean isLeap(int num) {
		
		
		if(num%100==0&&num%4==0||num%400==0) {
			return true;
		}else {
			return false;
		}
		 
	}
	
	void diamondDisplay(int line) {
		int count=1;
		if(line%2==0)line+=1;
		line=(line/2)+1;
		for(int i=-1; i<line-1;i++) {
	
			for(int k =0; k<(line*2)-count; k+=2) {
				System.out.print(" ");
			}
	
			for(int j =0; j<count; j++) {
				System.out.print("*");
			}
			count+=2;
			System.out.println();
		}
		count-=4;
		
		for(int i =line; i>=-1;i--) {
			for(int k = 0; k<(line*2)-count; k+=2) {
				System.out.print(" ");
			}
			for(int j =count; j>0; j--) {
				System.out.print("*");
			}
			count-=2;
			System.out.println();
		}
		
	}
}


