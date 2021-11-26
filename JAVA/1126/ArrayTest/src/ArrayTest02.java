import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int count= 3;
		
		String name[] = new String[count];
		int pay[] = new int[count];
		int worktime[] = new int[count];
		int base[] = new int[count];
		int bonus[] = new int[count];
		int total[] = new int[count];
		
		
		System.out.println("이름, 시간당 금여액, 근무시간을 입력해주세요");
		System.out.println();
		
		for(int i = 0; i<count; i++) {
			name[i] = sc.next();
			pay[i] = sc.nextInt();
			worktime[i] =sc.nextInt();
		}
		for(int i =0; i<count;i++) {
			base[i] = pay[i]*worktime[i];
			if(worktime[i]>20) {
				bonus[i] = (int)(pay[i]*0.5)*(worktime[i]-20);
			}else {
				bonus[i] = 0;
			}
			
			total[i] = base[i]+bonus[i];
		}
		
		
		System.out.println("이름\t시간당급여액\t근무시간\t기본급\t수당\t총합");
		for(int i =0; i<count;i++) {
			System.out.println(name[i]+"\t"+pay[i]+
					"\t\t"+worktime[i]+"\t"+base[i]+"\t"+bonus[i]+"\t"+total[i]+"\t");
		}
		
		
		
		
		
	}

}
