package 이진탐색트리;

public class BinarySearchTree {
   TreeNode root=null;// root 를 시작점으로 가지고 있어야 한다 
   
   void insert(String data)
   {
      //새로운 노드를 만들어서 root 에서 
      //data를 비교해서 작으면 노드의 왼쪽으로 이동하고, null찾을때까지 
      //data를 비교해서 크면 노드의 오른쪽으로 이동하고, null찾을때까지
      
      //새로운 노드가 들어갈 위치 찾기 
      TreeNode pTrace=root;
      TreeNode pTrace2=null;
      
      while(pTrace!=null)
      {
         if(pTrace.data.equals(data))//중복배제, 기존에 이미 키값이 존재하면 함수종료
            return; 
         
         pTrace2 = pTrace; //위치이동  //////////////////////////////////////////////////////
         
         if(pTrace.data.compareTo(data)>0)  //**********************
            pTrace = pTrace.left;
         else
            pTrace = pTrace.right;
      }
      
      //끝나고 나오면 pTrace 는 언제나 null 이고 실제 부모 개체는 pTrace2 
      
      TreeNode newNode = new TreeNode(data);
      if(pTrace2==null) //처음에 root 하나 추가이다.
         root = newNode;
      else
      {
         if( pTrace2.data.compareTo(data)>0 ) //**********************
            pTrace2.left = newNode;
         else 
            pTrace2.right = newNode;
      }
   }
   
   void makeTree()
   {
      String []words= {"rain", "rainbow", "opera", "question", "cloud", "windy", "snow", "snowman", "sunny",
              "cold", "hot", "desk", "flower", "survey", };
      
      for(String w : words)
         insert(w);
      
   }
   
   void inorder(TreeNode t)
   {
      if(t==null) return;
      
      inorder(t.left);
      System.out.print(t.data+" ");
      inorder(t.right);
   }
   
   void preorder(TreeNode t)
   {
      if(t==null) return;
      
      System.out.print(t.data+" ");
      preorder(t.left);
      preorder(t.right);
   }
   
   void search(String data)
   {
      TreeNode pTrace = root;
      int cnt=0;
      while(pTrace!=null)
      {
         cnt++;
         if(pTrace.data.equals(data))
         {
            System.out.printf("%d 번에 찾음\n", cnt);
            return; 
         }
         
         if(pTrace.data.compareTo(data)>0)
            pTrace = pTrace.left; 
         else
            pTrace = pTrace.right;
      }
      
      System.out.println("못찾음");
   }
   
   //삭제 
   void delete(String data)
   {
      //1.위치 찾기  삭제하고나면 부모노드에 대한 정보가 필요하다
      TreeNode pTrace = root; 
      TreeNode parent = null;//부모노드 -- 삭제 대상이 있으면 삭제대상의 부모와 삭제대상 자식을 연결해야함
      boolean isLeftChild=true;//왼쪽 자식이 있느냐 없느냐를 나타내기 위한 변수
      
      boolean found = false;//삭제대상 존재 여부
      while(pTrace!=null) //root부터 삭제 대상을 찾아나감. parent뒤에서 삭제 대상의 부모를 가리키면서 추적함.
      {
         if(pTrace.data.equals(data))
         {
            found=true;
            break;
         }
         
         parent = pTrace;  //못찾았을 경우 현재 노드를 부모노드로 저장하고 자식 중에 확인
         if(pTrace.data.compareTo(data)>0)//찾고자 하는 키값이 노드의 데이터보다 작으면 left로 이동
            pTrace = pTrace.left;
         else//값이 크면 right로 이동s
         {
            pTrace = pTrace.right;
            isLeftChild=false;//오른쪽 이동
         }
      }
      
      
      if(!found) return;  //못찾았으면 함수를 종료하자 
      
      
      //1.왼쪽자식이 없을때  
      if(pTrace.left ==null)
      {
         if(pTrace==root)//삭제 대상이 root일때
            root = pTrace.right;//왼쪽 자식이 없으므로 오른쪽 자식을 root로 올린다.
         else if(isLeftChild)//부모노드의 왼쪽에 붙어있으면 왼쪽을 null
            parent.left = pTrace.right; //삭제대상의 부모의 왼쪽에 내 자식을 연결(null 포함)
         else
            parent.right = pTrace.right;   
         return;
      }
      
      // 2.  오른쪽 자식이 없을때 
      if(pTrace.right==null)
      {
         if(pTrace==root)
            root = pTrace.left;
         else if(isLeftChild)//부모노드의 왼쪽에 붙어있으면 왼쪽을 null
            parent.left = pTrace.left; 
         else
            parent.right = pTrace.left;
         return;
      }
      
            
      //자식이 둘다 있을때 
      //위치배정을 다시해야 한다  그냥 아무데나 골라서 바꿔치기후 삭제한다  
      //삭제될 대상의 노드의 오른쪽 서브트리에서 가장 작은 대상을 찾아 바꿔차기한다 (이걸 선택한다)
      //삭제대상의 오른쪽 서브트리 참조를 가져온다
      
   
      
      //대체될 대상을 찾는다 
      TreeNode pSubParent = pTrace;
      TreeNode pSub = pTrace.right; //삭제대상의 오른쪽 서브트리 
       while(pSub.left!=null)
       {
          pSubParent = pSub;
          pSub = pSub.left;
       }
       
       
       pTrace.data = pSub.data;
       if (pSubParent.left == pSub)
          pSubParent.left=pSub.right;
       else
          pSubParent.right=pSub.right;
       
       
   }
}









