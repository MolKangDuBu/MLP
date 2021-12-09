package javaProject1;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product>list = new ArrayList<Product>();
		list.add(new Product(001, "노트북", 1200000, 2021, "삼성"));
		list.add(new Product(002, "모니터", 300000, 2021, "LG"));
		list.add(new Product(003, "마우스", 30000, 2020, "로지텍"));
		
		System.out.printf("%s \t %3s \t%3s\t %3s \t%s \n", "상품번호", "상품명", "가격", "연도", "제조사");
		System.out.println("------------------------------------");
		for(Product pd: list) {
			System.out.print(pd.toString()+"\n");
		}
		
	}

}
