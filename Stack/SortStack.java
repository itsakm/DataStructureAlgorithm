import java.util.*;
class SortStack
{
	public static void main(String[] args) {
		int a[]={11,2,32,3,41};
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<a.length;i++)
			st.push(a[i]);
		System.out.println(st);
		Stack<Integer> tst = new Stack<Integer>();
		while(!st.isEmpty())
		{
			System.out.println("h");
			int temp=st.pop();
			System.out.println(temp);
			while(!tst.isEmpty() && tst.peek()>temp)
			{
				System.out.println("h1");
				st.push(tst.pop());
			}
			tst.push(temp);
		}
		System.out.println(tst);
		System.out.println(tst.pop());
	}
}