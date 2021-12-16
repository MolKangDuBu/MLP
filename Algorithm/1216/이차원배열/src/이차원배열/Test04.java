package 이차원배열;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Test04 test = new Test04();
		int n = sc.nextInt();//0~100
		int m = sc.nextInt();//1~3
		
		switch(m) {
		case 1:
			test.Shape1(n);
			break;
		case 2:
			test.Shape2(n);
			break;
		case 3:
			test.Shape3(n);
			break;
			
		}
		
		
		
		
	}
	
	
	public void Shape1(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j =0; j<n;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
		
	}
	
	public void Shape2(int n) {
		int j=0;
		
		for(int i=0; i<n;i++) {
		
			if(j>=n) {
				for(j=n;j>0;j--) {
					System.out.print(j+"\t");
				}
			}else if(j<=0){
				for(j=1;j<=n;++j) {
					System.out.print(j+"\t");
				}
			}
			System.out.println();
		}
		
		
	}
	public void Shape3(int n) {
		
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
