package javaProject2;

import java.util.ArrayList;
import java.util.List;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book>Book_List = new ArrayList<Book>();
		List<Magazine>Maga_List = new ArrayList<Magazine>();
		
		Book_List.add(new Book(001, "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�"));
		Book_List.add(new Book(002, "�ڹٽ�ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�"));
		Book_List.add(new Book(003, "HTML/CSS", "������", 18000, 2021, "�������ǻ�"));
		
		System.out.printf("%s \t%s \t\t%-6s %s \t%6s \t%3s\n","������ȣ", "������", "����", "����", "������", "���ǻ�");
		System.out.println("------------------------------------------------------------------------");
		for(Book b: Book_List) {
			System.out.println(b.toString());
		}
		
		
		Maga_List.add(new Magazine(001, "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5));
		Maga_List.add(new Magazine(002, "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7));
		Maga_List.add(new Magazine(003, "���� ����", "������", 18000, 2021, "�������ǻ�", 9));
		
		System.out.println();
		System.out.printf("%s \t%s \t%-6s %s \t%7s \t%3s \t%11s\n","������ȣ", "������", "������", "����", "���࿬��", "���ǻ�", "�����");
		System.out.println("------------------------------------------------------------------------");
		for(Magazine m: Maga_List) {
			System.out.println(m.toString());
		}
			
			
		
	}

}
