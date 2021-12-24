package algorismProject2;

import algorismProject2.Products;


public class BinaryTree {
	
	Products root = null;

	
	void insert(int Num, String name) {

	      Products pTrace=root;
	      Products pTrace2=null;
	      
	      while(pTrace!=null)
	      {
	         if(pTrace.productName.equals(name)&&pTrace.productNum==Num){
	        	 System.out.println("이민 등록된 제품입니다."); 
	        	 return;
	         }
	           
	         
	         pTrace2 = pTrace; 
	         
	         if(pTrace.productNum>Num) 
	            pTrace = pTrace.left;
	         else
	            pTrace = pTrace.right;
	      }
	      
	     
	      
	      Products newNode = new Products(Num, name);
	      if(pTrace2==null)
	         root = newNode;
	      else
	      {
	         if( pTrace2.productNum>Num )
	            pTrace2.left = newNode;
	         else 
	            pTrace2.right = newNode;
	      }
	}
	
	void delete(int Num) {
		 
	      Products pTrace = root; 
	      Products parent = null;
	      boolean isLeftChild=true;
	      
	      boolean found = false;
	      while(pTrace!=null)
	      {
	         if(pTrace.productNum==Num)
	         {
	            found=true;
	            break;
	         }
	         
	         parent = pTrace;  
	         if(pTrace.productNum>Num)
	            pTrace = pTrace.left;
	         else
	         {
	            pTrace = pTrace.right;
	            isLeftChild=false;
	         }
	      }
	      
	      
	      if(!found) return;
	
	      if(pTrace.left ==null)
	      {
	         if(pTrace==root)
	            root = pTrace.right;
	         else if(isLeftChild)
	            parent.left = pTrace.right; 
	         else
	            parent.right = pTrace.right;   
	         return;
	      }
	      
	   
	      if(pTrace.right==null)
	      {
	         if(pTrace==root)
	            root = pTrace.left;
	         else if(isLeftChild)
	            parent.left = pTrace.left; 
	         else
	            parent.right = pTrace.left;
	         return;
	      }

	      Products pSubParent = pTrace;
	      Products pSub = pTrace.right; 
	       while(pSub.left!=null)
	       {
	          pSubParent = pSub;
	          pSub = pSub.left;
	       }
	       
	       
	       pTrace.productName = pSub.productName;
	       pTrace.productNum=pSub.productNum;
	       if (pSubParent.left == pSub)
	          pSubParent.left=pSub.right;
	       else
	          pSubParent.right=pSub.right;
	       
	       
	   }
	
	boolean isEmpty() {
		if(root==null) {
			System.out.println("등록된 상품이 없습니다.");
			return true;
		}
		else return false;
		
	}
	void preorder(Products t)
	   {
		  if(t==null) {
	    	  return;
	      }
	      System.out.println(t.productNum+" "+t.productName);
	      preorder(t.left);
	      preorder(t.right);
	   }
	
	void search(int num) {
		 Products pTrace = root;
	      int cnt=0;
	      while(pTrace!=null)
	      {
	         cnt++;
	         if(pTrace.productNum==num)
	         {
	            System.out.println("상품명 : "+pTrace.productName);
	            return; 
	         }
	         
	         if(pTrace.productNum>num)
	            pTrace = pTrace.left; 
	         else
	            pTrace = pTrace.right;
	      }
	      
	      System.out.println("등록된 상품이 없습니다.");
	}
}
