
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(연습문제 1)  1 ~ n 까지의 정수의 합산이 1000을 넘는 최초의    n 값을 구하시오.
		
		int sum=0;
		int n=1;
		
		while(true) {
			sum+=n;
			if(sum>1000) {
				break;
			}
			n++;
		}
		System.out.println("최초 n : "+n);
	}

}
