class LinkedList
{
	static Node head;

	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}


	public static void delete(int key)
	{
		Node temp=head,prev=null;

		if(temp!=null && temp.data==key)
		{
			head=head.next;
			return;
		}
		while(temp!=null && temp.data!=key)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) return;
		prev.next=temp.next;
	}

	public static void append(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new Node(new_data);
			return;
		}

		new_node.next=null;
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	public static void insertAfter(Node prev_node,int new_data)
	{
		if(prev_node==null)
		{
			System.out.println("the given ");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}

	public static void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next=head;
		head=new_node;
	}

	public static  void printlist()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		Node first= new Node(1);
		ll.head=first;
		//ll.head= new Node(1);
		Node second= new Node(2);
		Node third = new Node(3);
		first.next=second;
		second.next=third;

		push(5);
		insertAfter(second,6);
		append(9);
		delete(3); 

		printlist();
		/*System.out.println(first.data);
		System.out.println(second.data);
		System.out.println(second.next);
*/


	}
}