package ����Ž��Ʈ��;

public class BinarySearchTree {
	TreeNode root=null;// root �� ���������� ������ �־�� �Ѵ� 
	
	void insert(String data)
	{
		//���ο� ��带 ���� root ���� 
		//data�� ���ؼ� ������ ����� �������� �̵��ϰ�, nullã�������� 
		//data�� ���ؼ� ũ�� ����� ���������� �̵��ϰ�, nullã��������
		
		//���ο� ��尡 �� ��ġ ã�� 
		TreeNode pTrace=root;
		TreeNode pTrace2=null;
		
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data))//�ߺ�����, ������ �̹� Ű���� �����ϸ� �Լ�����
				return; 
			
			pTrace2 = pTrace; //��ġ�̵�  //////////////////////////////////////////////////////
			
			if(pTrace.data.compareTo(data)>0)  //**********************
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		//������ ������ pTrace �� ������ null �̰� ���� �θ� ��ü�� pTrace2 
		
		TreeNode newNode = new TreeNode(data);
		if(pTrace2==null) //ó���� root �ϳ� �߰��̴�.
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
				System.out.printf("%d ���� ã��\n", cnt);
				return; 
			}
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left; 
			else
				pTrace = pTrace.right;
		}
		
		System.out.println("��ã��");
	}
	
	//���� 
	void delete(String data)
	{
		//1.��ġ ã��  �����ϰ��� �θ��忡 ���� ������ �ʿ��ϴ�
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
			
			pTrace2 = pTrace;  //��尪 �����ϰ� 
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		
		if(!found) return;  //��ã������ �Լ��� �������� 
		
		
		//1.�ڽ��� �ϳ��� ���°��  2. �ڽ��� ���� �ϳ��� ������   3.�ڽ��� �Ѵ� ������ 
		if(pTrace.left ==null && pTrace.right==null)
		{
			System.out.println("1"); 
			if(pTrace2.left== pTrace)//�θ����� ���ʿ� �پ������� ������ null
				pTrace2.left = null; 
			else
				pTrace2.right = null;
			
			return;
		}
		
		
		// 2. �ڽ��� ���ʸ� ������ 
		if(pTrace.left !=null || pTrace.right==null)
		{
			System.out.println("2"); 
			System.out.println("**" + pTrace.data+ "**");
			//System.out.println("**" + pTrace.left.data+ "**");
			//�ڽ��� ����ġ �ö�´� 
			if(pTrace2.left== pTrace)//�θ����� ���ʿ� �پ������� ������ null
				pTrace2.left = pTrace.left; 
			else
				pTrace2.right = pTrace.left;
			return;
		}
		
		//�����ʸ� ������ 
		if(pTrace.left ==null || pTrace.right!=null)
		{
			System.out.println("2"); 
			System.out.println("**" + pTrace.data+ "**");
			//System.out.println("**" + pTrace.left.data+ "**");
			//�ڽ��� ����ġ �ö�´� 
			if(pTrace2.right== pTrace)
				pTrace2.right = pTrace.right; 
			else
				pTrace2.right = pTrace.right;
			return;
		}		
		//�ڽ��� �Ѵ� ������ 
		//��ġ������ �ٽ��ؾ� �Ѵ�  �׳� �ƹ����� ��� �ٲ�ġ���� �����Ѵ�  
		//������ ����� ����� ������ ����Ʈ������ ���� ���� ����� ã�� �ٲ������Ѵ� (�̰� �����Ѵ�)
		//��������� ������ ����Ʈ�� ������ �����´�
		
		//System.out.println("**" + pTrace.data+ "**");
		//System.out.println("**" + pTrace.left.data+ "**");
		//System.out.println("**" + pTrace.right.data+ "**");
		
		//pTrace2 - �θ��� ���� 
		//System.out.println(pTrace2.data);
		
		//��ü�� ����� ã�´� 
		TreeNode pSubParent = pTrace;
		TreeNode pSub = pTrace.right; //��������� ������ ����Ʈ�� 
 		while(pSub.left!=null)
 		{
 			pSubParent = pSub;
 			pSub = pSub.left;
 		}
 		
 		
 		//�θ���� ������Ѿ� �Ѵ�. 
 		//������� - pTrace
 		//�θ� - pTrace2;
 		//pSubParent- ��ü�� ����� �θ��̴�. 
 		//�θ����� ���ʿ� �پ� �վ��ٸ� 
 		//��ü�� ��� - pSub;
 		
 		pTrace.data = pSub.data;
 		if (pSubParent.left == pSub)
 			pSubParent.left=pSub.right;
 		else
 			pSubParent.right=pSub.right;
 		
 		
	}
}










