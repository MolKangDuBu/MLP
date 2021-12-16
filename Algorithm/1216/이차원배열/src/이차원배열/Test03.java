package 이차원배열;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[10][10];
		int i,j,b;
		int count=1;
		for(i=0;i<num.length;i++) {
			for(j=0;j<=i;j++) {
				num[j][i] =count++;
			}
			for(b=j; b<num.length; b++) {
				num[i][b] = 0;
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
