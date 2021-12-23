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
		String []words= {"rain", "rainbow", "opera"};
		
		//, "question", "cloud", "windy", "snow", "snowman", "sunny",
		//		  "cold", "hot", "desk", "flower", "survey", };
		
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
		TreeNode pTrace2 = null;
		boolean found = false;
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data))
			{
				found=true;
				break;
			}
			
			pTrace2 = pTrace;  //노드값 저장하고 
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		
		if(!found) return;  //못찾았으면 함수를 종료하자 
		
		
		//1.자식이 하나도 없는경우  2. 자식이 둘중 하나만 있을때   3.자식이 둘다 있을때 
		if(pTrace.left ==null && pTrace.right==null)
		{
			System.out.println("1"); 
			if(pTrace2.left== pTrace)//부모노드의 왼쪽에 붙어있으면 왼쪽을 null
				pTrace2.left = null; 
			else
				pTrace2.right = null;
			
			return;
		}
		
		
		// 2. 자식이 왼쪽만 있을때 
		if(pTrace.left !=null || pTrace.right==null)
		{
			System.out.println("2"); 
			System.out.println("**" + pTrace.data+ "**");
			//System.out.println("**" + pTrace.left.data+ "**");
			//자식이 내위치 올라온다 
			if(pTrace2.left== pTrace)//부모노드의 왼쪽에 붙어있으면 왼쪽을 null
				pTrace2.left = pTrace.left; 
			else
				pTrace2.right = pTrace.left;
			return;
		}
		
		//오른쪽만 있을때 
		if(pTrace.left ==null || pTrace.right!=null)
		{
			System.out.println("2"); 
			System.out.println("**" + pTrace.data+ "**");
			//System.out.println("**" + pTrace.left.data+ "**");
			//자식이 내위치 올라온다 
			if(pTrace2.right== pTrace)
				pTrace2.right = pTrace.right; 
			else
				pTrace2.right = pTrace.right;
			return;
		}		
		//자식이 둘다 있을때 
		//위치배정을 다시해야 한다  그냥 아무데나 골라서 바꿔치기후 삭제한다  
		//삭제될 대상의 노드의 오른쪽 서브트리에서 가장 작은 대상을 찾아 바꿔차기한다 (이걸 선택한다)
		//삭제대상의 오른쪽 서브트리 참조를 가져온다
		
		//System.out.println("**" + pTrace.data+ "**");
		//System.out.println("**" + pTrace.left.data+ "**");
		//System.out.println("**" + pTrace.right.data+ "**");
		
		//pTrace2 - 부모노드 정보 
		//System.out.println(pTrace2.data);
		
		//대체될 대상을 찾는다 
		TreeNode pSubParent = pTrace;
		TreeNode pSub = pTrace.right; //삭제대상의 오른쪽 서브트리 
 		while(pSub.left!=null)
 		{
 			pSubParent = pSub;
 			pSub = pSub.left;
 		}
 		
 		
 		//부모노드와 연결시켜야 한다. 
 		//삭제대상 - pTrace
 		//부모 - pTrace2;
 		//pSubParent- 대체될 대상의 부모이다. 
 		//부모노드의 왼쪽에 붙어 잇었다면 
 		//대체될 대상 - pSub;
 		
 		pTrace.data = pSub.data;
 		if (pSubParent.left == pSub)
 			pSubParent.left=pSub.right;
 		else
 			pSubParent.right=pSub.right;
 		
 		
	}
}










