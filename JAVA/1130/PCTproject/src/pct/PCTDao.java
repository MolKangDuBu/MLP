package pct;

import java.util.ArrayList;
import java.util.Scanner;

public class PCTDao {
	
	ArrayList<PCTData> list = new ArrayList<PCTData>();
	Scanner sc = new Scanner(System.in);

	
	public void append() {
		PCTData data = new PCTData();
		System.out.print("이름 : ");
		data.setName(sc.next());
		int i= 0;		
		
		

		data.setWrite(Input("필기", 400));
	
		data.setWord(Input("워드", 200));
	
		data.setSpread(Input("스프레드", 200));
	
		data.setPpt(Input("프리젠트", 200));
		
		data.caculate();
		list.add(data);
	}
	
	
	
	public int Input(String subject, int limit) {

		int temp;
		System.out.print(subject+" : ");
		temp = sc.nextInt();
		while(temp<0||temp >limit) {
			System.out.printf("0~%d범위의 값을 입력해주세요\n", limit);
			System.out.printf("%s : ", subject);
			temp = sc.nextInt();
		}
		
		return temp;
		
	}
	
	
	
	public void output() {
		for(PCTData pct : list) {
			System.out.printf("%s %d %d %d %d %d %s\n",pct.getName(), pct.getWrite(),
					pct.getWord(), pct.getPpt(), pct.getSpread(),pct.getTotal(), pct.getGrade());
		}
	}
	
	
	public void menuDisplay() {
		System.out.println("---------------");
		System.out.println("\t메뉴\t");
		System.out.println("---------------");
		System.out.println("1.추가");
		System.out.println("2.출력");
		System.out.println("3.검색");
		System.out.println("0.종료");
		System.out.println("---------------");		
	}
	
	public void start() {
	
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: append();break;
			case 2: output(); break;
			case 3: System.out.println("검색");break;
			case 0:System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
