import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int student = 5;//�л� ��
		String name[] = new String[student];//�̸�
		int test[] = new int[student];//�ʱ�
		int word[] = new int[student];//����
		int ppt[] = new int[student];//�Ŀ�����Ʈ
		int spread[] = new int[student];//��������
		int total[] = new int[student];//����
		String grades[] = new String[student];//���
		
		//��� ��
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		
		for(int i=0; i<student; i++) {//�Էºκ�
			System.out.print("�̸� : ");
			name[i] = sc.next();
			System.out.print("�ʱ� ���� : ");
			test[i] = sc.nextInt();
			System.out.print("���� ���� : ");
			word[i] = sc.nextInt();
			System.out.print("�Ŀ�����Ʈ ���� : ");
			ppt[i] = sc.nextInt();
			System.out.print("�������� ���� : ");
			spread[i] = sc.nextInt();
			System.out.println();
		}
		
		for(int i =0; i<student; i++) {//���� �ջ� �� ��� ���
			total[i] = test[i]+word[i]+ppt[i]+spread[i];
			if(total[i]>=800) {
				grades[i] = "A";
				A++;
			}else if(800>total[i]&& total[i]>=600) {
				grades[i]= "B";
				B++;
			}else if(600> total[i]&&total[i]>=400) {
				grades[i]="C";
				C++;
			}else {
				grades[i]= "D ����� ���";
				D++;
			}
		}
		
		//���
		System.out.println("-------------------------------------");
		System.out.println("�̸�\t�ʱ�\t����\t�Ŀ�����Ʈ\t��������\t���");
		for(int i =0; i<student; i++) {
			System.out.println(name[i]+"\t"+test[i]+"\t"+word[i]+"\t"+
					ppt[i]+"\t"+spread[i]+"\t"+grades[i]);
		}
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("A���\tB���\tC���\tD���");
		System.out.println(A+"\t"+B+"\t"+C+"\t"+D);
		
		
		
	}

}