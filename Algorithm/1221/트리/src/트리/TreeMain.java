package Ʈ��;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
//		tree.makeTree();
		tree.makeTree("ABCDEFGHIJKLMN");
		tree.inorder(tree.root);//���� �켱 Ž��
		System.out.println();
		tree.preorder(tree.root);//���� �켱
		System.out.println();
		tree.postorder(tree.root);//���� �켱
		System.out.println();	
		tree.levelorder(tree.root);//�ʺ�켱Ž��
		
		System.out.println();

	}

}
