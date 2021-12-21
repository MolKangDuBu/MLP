package Ʈ��;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	TreeNode root;
	
	void makeTree() {
		root = new TreeNode();
		root.data = "A";
		
		root.left = new TreeNode();
		root.left.data = "B";
		
		root.right = new TreeNode();
		root.right.data = "C";
		
		TreeNode child = root.left;
		child.left = new TreeNode();
		child.left.data = "D";
		
		child.right = new TreeNode();
		child.right.data = "E";
		
		child = root.right;
		child.left = new TreeNode();
		child.left.data = "F";
		child.right = new TreeNode();
		child.right.data = "G";
	}
	
	void inorder(TreeNode start) {
		if(start ==null)return;
		inorder(start.left);
		System.out.print(start.data+ " ");
		inorder(start.right);
	}
	
	void preorder(TreeNode start) {
		if(start ==null)return;
		System.out.print(start.data+ " ");
		preorder(start.left);
		preorder(start.right);
	}
	
	void postorder(TreeNode start) {
		if(start ==null)return;

		postorder(start.left);
		postorder(start.right);
		System.out.print(start.data+ " ");
	}
	
	void levelorder(TreeNode start) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(start);
		
		while(!q.isEmpty()) {
			TreeNode temp = q.poll();//get���
			System.out.print(temp.data+" ");
			if(temp.left != null)q.add(temp.left);
			if(temp.right != null)q.add(temp.right);
		}
		System.out.println();
	}
	  /*
	    * ť�� ����
	    * ť�� root �߰��ϱ� 
	    * �߰��� ��ġ ã�� ���� - levelorder
	    * {
	    *   1.queue���� �ϳ� �����´� 
	    *   2.left �� null�̸� ���⿡ �߰��Ѵ�  �ƴϸ� ť�� left�� �߰��Ѵ�
	    *   3.right �� null�̸� ���⿡ �߰��Ѵ�  �ƴϸ� ť�� right�� �߰��Ѵ� 
	    *   4.��尡 �߰��ɶ����� 1,2,3�� �ݺ��Ѵ�
	    *   } 
	    */
	   void makeTree(String data)
	   {
	      Queue<TreeNode> queue = new LinkedList<TreeNode>();
	      this.root = new TreeNode();
	      this.root.data = data.charAt(0)+"";
	      
	      int i=1;
	      while(i<data.length())
	      {
	         queue.clear();
	         queue.add(root); //ó�� root���� ��� ã�Ƽ� ����ִ� ��带 ã�������� ���� ������ �ݺ��Ѵ� 
	         while(true) //�߰��Ǹ� ���߰� ���´� 
	         {
	            TreeNode temp = queue.poll();  
	            if( temp.left == null)
	            {
	               temp.left= new TreeNode();
	               temp.left.data = data.charAt(i++)+"";
	               break;
	            }
	            else if( temp.right == null)
	            {
	               temp.right= new TreeNode();
	               temp.right.data = data.charAt(i++)+"";
	               break;
	            }
	            else
	            {
	               queue.add( temp.left);
	               queue.add( temp.right);
	            }
	               
	         }
	      }
	      System.out.println();
	      
	   }

}
