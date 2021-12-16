package 이차원배열;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[10][10];
		int i;
		int b;
		int j;
		int count =1;
		for(i=0; i<num.length;i++) {
			
			for(b=0; b<(num[i].length-1)-i;b++) {
				num[i][b] = 0;
			}
			for(j=b; j<num[i].length; j++) {
				num[i][j] = count++;
			}
			
		}
		
		
		
		for(i=0; i<num.length;i++) {
			for(j=0; j<num[i].length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
