import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int student = 5;//학생 수
		String name[] = new String[student];//이름
		int test[] = new int[student];//필기
		int word[] = new int[student];//워드
		int ppt[] = new int[student];//파워포인트
		int spread[] = new int[student];//스프레드
		int total[] = new int[student];//총점
		String grades[] = new String[student];//등급
		
		//등급 수
		int A=0;
		int B=0;
		int C=0;
		int D=0;
		
		for(int i=0; i<student; i++) {//입력부분
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("필기 점수 : ");
			test[i] = sc.nextInt();
			System.out.print("워드 점수 : ");
			word[i] = sc.nextInt();
			System.out.print("파워포인트 점수 : ");
			ppt[i] = sc.nextInt();
			System.out.print("스프레드 점수 : ");
			spread[i] = sc.nextInt();
			System.out.println();
		}
		
		for(int i =0; i<student; i++) {//점수 합산 및 등급 계산
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
				grades[i]= "D 재시험 요망";
				D++;
			}
		}
		
		//출력
		System.out.println("-------------------------------------");
		System.out.println("이름\t필기\t워드\t파워포인트\t스프레드\t등급");
		for(int i =0; i<student; i++) {
			System.out.println(name[i]+"\t"+test[i]+"\t"+word[i]+"\t"+
					ppt[i]+"\t"+spread[i]+"\t"+grades[i]);
		}
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("A등급\tB등급\tC등급\tD등급");
		System.out.println(A+"\t"+B+"\t"+C+"\t"+D);
		
		
		
	}

}
