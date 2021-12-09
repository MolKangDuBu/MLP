package pct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		System.out.println("4. �ҷ�����");
		System.out.println("5. ����");
		System.out.println("0.����");
		System.out.println("---------------");		
	}
	
	public void load() {
		list.clear();
		File file = new File("PCT.txt");
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			line = br.readLine();
			while(line != null) {
				String []temps = line.split(" ");
				PCTData dto = new PCTData();
				dto.setName(temps[0]);
				dto.setWrite(Integer.parseInt(temps[1]));
				dto.setWord(Integer.parseInt(temps[2]));
				dto.setSpread(Integer.parseInt(temps[3]));
				dto.setPpt(Integer.parseInt(temps[4]));
				
				list.add(dto);
				line = br.readLine();
			}
			br.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
	
	public void save() {
		File file = new File("PCT.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			if(file.isFile()&&file.canWrite()) {
				for(PCTData data: list) {
					bw.write(String.format("%s %d %d %d %d\n", data.getName(),
							data.getWrite(), data.getWord(), data.getSpread(), data.getPpt()));
				}
				
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
			case 4:load(); output();break;
			case 5: save();break;
			case 0:System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
