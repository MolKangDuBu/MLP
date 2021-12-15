import java.util.List;
import java.util.Scanner;

public class ProductService {
	
	Scanner sc = new Scanner(System.in);
	ProductDao dao = new ProductDao();
	
	void menuDisplay() {
		System.out.println("1. 목록보기");
		System.out.println("2. 추가하기");
		System.out.println("3. 수정하기");
		System.out.println("4. 삭제하기");
		System.out.println("0. 종료하기");
	}
	
	void start() {
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int sel = sc.nextInt();
			switch(sel) {
			case 1: output();break;
			case 2 : input(); break;
			case 0: return;
			}
				
		}
	}
	void input() {
		ProductDto INPUT = new ProductDto();
		System.out.print("입력값(ID, Name, Model, Maker, Price) : ");
		sc.nextLine();
		String ID =sc.next();
		String Name =sc.next();
		String Model =sc.next();
		String Maker =sc.next();
		String Price =sc.next();
		
		INPUT.setProduct_id(ID);
		INPUT.setProduct_name(Name);
		INPUT.setProduct_model(Model);
		INPUT.setMaker(Maker);
		INPUT.setPrice(Price);
		
		dao.insertProduct(INPUT);
		
	}
	void output() {
		List<ProductDto> list = dao.selectProduct();
		for(ProductDto dto :list) {
			System.out.printf("%s\t", dto.getProduct_id());
			System.out.printf("%s\t", dto.getProduct_name());
			System.out.printf("%s\t", dto.getProduct_model());
			System.out.printf("%s\t", dto.getMaker());
			System.out.printf("%s\n", dto.getPrice());
		}
	}
}


