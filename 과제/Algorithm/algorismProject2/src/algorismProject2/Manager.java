package algorismProject2;

import java.util.Scanner;

public class Manager {

	Scanner sc = new Scanner(System.in);
	BinaryTree bt = new BinaryTree();
	boolean run =true;
	public Manager() {
		display();

	}
	
	
	public void display() {
		int Num;
		String Name;
		while(run) {
			System.out.println("(1) 상품 등록 (2) 상품 삭제 (3) 상품 검색 (4) 전체 상품 조회 (5) 종료");
			System.out.print("메뉴 선택 : ");
			switch(sc.nextInt()) {
			case 1: System.out.println("상품등록");	
					System.out.print("상품 번호 입력 : ");
					Num = sc.nextInt();
					System.out.print("상품명 입력 : ");
					Name =sc.next();
					bt.insert(Num, Name);
				break;
			case 2:
				System.out.println("상품 삭제");
				System.out.print("상품 번호 입력 : ");
				Num = sc.nextInt();
				bt.delete(Num);
				break;
			case 3:
				System.out.println("상품 검색");
				System.out.print("상품 번호 입력 :");
				Num  =sc.nextInt();
				bt.search(Num);
				break;
			case 4: 
				if(!bt.isEmpty()) bt.preorder(bt.root);
				break;
			case 5:
				run =false;
				break;
			}
		}
	}
}
