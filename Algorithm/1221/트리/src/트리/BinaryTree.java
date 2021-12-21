package 트리;

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
			TreeNode temp = q.poll();//get대신
			System.out.print(temp.data+" ");
			if(temp.left != null)q.add(temp.left);
			if(temp.right != null)q.add(temp.right);
		}
		System.out.println();
	}
	  /*
	    * 큐를 비우고
	    * 큐에 root 추가하기 
	    * 추가될 위치 찾는 과정 - levelorder
	    * {
	    *   1.queue에서 하나 가져온다 
	    *   2.left 가 null이면 여기에 추가한다  아니면 큐에 left를 추가한다
	    *   3.right 가 null이면 여기에 추가한다  아니면 큐에 right를 추가한다 
	    *   4.노드가 추가될때까지 1,2,3을 반복한다
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
	         queue.add(root); //처음 root부터 계속 찾아서 비어있는 노드를 찾을때까지 같은 동작을 반복한다 
	         while(true) //추가되면 멈추고 나온다 
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
