package javaProject1;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>list = new ArrayList<Product>();
		list.add(new Product(001, "��Ʈ��", 1200000, 2021, "�Ｚ"));
		list.add(new Product(002, "�����", 300000, 2021, "LG"));
		list.add(new Product(003, "���콺", 30000, 2020, "������"));
		
		System.out.printf("%s \t %3s \t%3s\t %3s \t%s \n", "��ǰ��ȣ", "��ǰ��", "����", "����", "������");
		System.out.println("------------------------------------");
		for(Product pd: list) {
			System.out.print(pd.toString()+"\n");
		}
		
	}

}
