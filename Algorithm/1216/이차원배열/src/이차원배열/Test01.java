package 이차원배열;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][]num= new int[5][5];
		int count=1;
		int rowsum=0;
		int columnsum=0;
		
		for(int i=0; i<num.length-1;i++) {
			for(int j =0; j<num[i].length-1;j++) {
				num[i][j] =count++;
			}
		}
	
		
		for(int i=0; i<num.length-1;i++) {
			for(int j =0; j<num[i].length-1;j++) {
				rowsum += num[i][j];
			}
			num[i][num[i].length-1] = rowsum;
			rowsum=0;
		
		}
		
		
		for(int i=0; i<num.length;i++) {
			for(int j =0; j<num[i].length-1;j++) {
				
				columnsum += num[j][i];
			}
			num[num.length-1][i] = columnsum;
			columnsum =0;
		}
		
	
		for(int i=0; i<num.length;i++) {
			for(int j =0; j<num[i].length;j++) {
				
				System.out.print(num[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
