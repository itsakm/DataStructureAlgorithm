import java.util.*;
class MaxDisBwSameElement
{
	public static void main(String[] args) {
		int a[]={3,2,1,2,1,4,5,8,6,7,4,2};
		HashMap<Integer,Integer> h = new HashMap<>();
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(!h.containsKey(a[i]))
			{
				h.put(a[i],i);
			}
			else if(h.containsKey(a[i]))
			{
				int diff=i-h.get(a[i]);
				if(diff>=max)
					max=diff;
				
			}
		}
		System.out.println(h);
		System.out.println("diff="+max);
	}
}