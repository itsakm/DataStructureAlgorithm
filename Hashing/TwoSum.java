import java.util.*;
class TwoSum
{
	public static void main(String[] args) {
		int a[]={1,4,45,6,10,8};
		int X=16;
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
			h.add(a[i]);
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			int diff=X-(int)(itr.next());
			System.out.println("itr="+itr.next());
			System.out.println("diff="+diff);
			if(h.contains(diff))
				System.out.println(true);
			else
				System.out.println(false);
			System.out.println(itr.next());
		}

		/*while(i<h.size())
		{
			int diff=X-h.m;
			System.out.println(diff);
			if(h.contains(diff))
				System.out.println(true);
			else
				System.out.println(false);
			i++;
		}*/
		
	}
}