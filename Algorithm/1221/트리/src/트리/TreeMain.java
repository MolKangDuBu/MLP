package 飘府;

public class TreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
//		tree.makeTree();
		tree.makeTree("ABCDEFGHIJKLMN");
		tree.inorder(tree.root);//表捞 快急 沤祸
		System.out.println();
		tree.preorder(tree.root);//表捞 快急
		System.out.println();
		tree.postorder(tree.root);//表捞 快急
		System.out.println();	
		tree.levelorder(tree.root);//呈厚快急沤祸
		
		System.out.println();

	}

}
