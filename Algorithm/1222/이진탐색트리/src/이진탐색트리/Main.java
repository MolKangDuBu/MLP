package ����Ž��Ʈ��;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree st = new BinarySearchTree();
		st.makeTree();
//		st.inorder(st.root);
		st.preorder(st.root);
		
		st.search("windy");
		st.delete("rainbow");
		st.preorder(st.root);
	}

}
