package pct;

import java.util.ArrayList;
import java.util.Scanner;

public class PCTDao {
	
	ArrayList<PCTData> list = new ArrayList<PCTData>();
	Scanner sc = new Scanner(System.in);

	
	public void append() {
		PCTData data = new PCTData();
		System.out.print("�̸� : ");
		data.setName(sc.next());
		int i= 0;		
		
		

		data.setWrite(Input("�ʱ�", 400));
	
		data.setWord(Input("����", 200));
	
		data.setSpread(Input("��������", 200));
	
		data.setPpt(Input("������Ʈ", 200));
		
		data.caculate();
		list.add(data);
	}
	
	
	
	public int Input(String subject, int limit) {

		int temp;
		System.out.print(subject+" : ");
		temp = sc.nextInt();
		while(temp<0||temp >limit) {
			System.out.printf("0~%d������ ���� �Է����ּ���\n", limit);
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
		System.out.println("\t�޴�\t");
		System.out.println("---------------");
		System.out.println("1.�߰�");
		System.out.println("2.���");
		System.out.println("3.�˻�");
		System.out.println("0.����");
		System.out.println("---------------");		
	}
	
	public void start() {
	
		while(true) {
			menuDisplay();
			System.out.print("���� : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: append();break;
			case 2: output(); break;
			case 3: System.out.println("�˻�");break;
			case 0:System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
