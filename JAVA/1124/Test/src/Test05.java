
public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(�������� 1)  1 ~ n ������ ������ �ջ��� 1000�� �Ѵ� ������    n ���� ���Ͻÿ�.
		
		int sum=0;
		int n=1;
		
		while(true) {
			sum+=n;
			if(sum>1000) {
				break;
			}
			n++;
		}
		System.out.println("���� n : "+n);
	}

}