public class Tree1
{
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode rootLeft=new TreeNode(2);
		TreeNode rootRight=new TreeNode(3);
		TreeNode child1=new TreeNode(4);
		TreeNode child2=new TreeNode(5);
		TreeNode child3=new TreeNode(6);
		TreeNode child4=new TreeNode(7);
		root.left=rootLeft;
		root.right=rootRight;
		rootLeft.left=child1;
		rootLeft.right=child2;
		rootRight.left=child3;
		rootRight.right=child4;
		root.preorder(root);
		System.out.println("");
		root.postorder(root);
		System.out.println();
		root.inorder(root); 
		System.out.println( root.countNodes(root));
		System.out.println(root.height(root )); 
		System.out.println(root.LeafNode(root));
		root.mirror(root);
		System.out.println();
		root.preorder(root);

	}
	
}
class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data)
	{
		this.data=data;
	}
	public static boolean isBalanced(TreeNode root)
	{
		if(root=null)
		{
			return true;
		}
		if(Math.abs(height(root.left)-height(root.right))>1){
			return false;	
		}
		boolean left=isBalanced(root.left);
		boolean right=isBalanced(root.right);
		return left && right;
	}
	public static void preorder(TreeNode root)
	{
		if(root==null)
		{
			return;	
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(TreeNode root)
	{
		if(root==null)
		{
			return;	
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data);	
	}
	public static void inorder(TreeNode root)
	{
		if(root==null)
		{
			return;	
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
			
	}
	public static void levelorder(TreeNode root)
	{
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode p= q.poll();
			System.out.println(p.data );
			if(p.left!=null)
			{
				q.add(p.left);
			}
			if(p.right!=null)
			{
				q.add(p.right);
			}
		}
	}
	/*public static void levelorderRec(TreeNode root,int h)
	{
		if(root==null)
		{
			return;
		}
		if()
		levelorderRec(root.left,h-1);
		levelorderRec(root.right,h-1);
	}*/
	public static TreeNode Removeleaves(TreeNode root)
	{
		if(root=null)
		{
			return null;
		}
		if(root.left=null && root.right=null)
		{
			return null;
		}
		root.left=Removeleaves(root.left);
		root.right=Removeleaves(root.right);
		return root;
	}
	public static int countNodes(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=countNodes(root.left);
		int rightnodes=countNodes(root.right);
		return 1+leftnodes+rightnodes;
	}
	public static int height(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=height(root.left);
		int rightnodes=height(root.right);
		return 1+Math.max(leftnodes,rightnodes);

	}
	public static int LeafNode(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null && root.right==null)
		{
			return 1;
		}
		return LeafNode(root.left)+LeafNode(root.right);
	}
	public static void mirror(TreeNode root)
	{
		if(root==null)
		{
			return;
		}
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		mirror(root.left);
		mirror(root.right);
	}
}

