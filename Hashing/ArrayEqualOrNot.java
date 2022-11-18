import java.util.*;
class ArrayEqualOrNot
{
	public static void main(String[] args) {
		int a[]={1,2,5,4,0};
		int b[]={2,4,5,0,1,2};
		HashMap<Integer,Integer> h= new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!h.containsKey(a[i]))
			{
				h.put(a[i],1);
			}
			else if(h.containsKey(a[i]))
			{
				h.put(a[i],h.get(a[i])+1);
			}
		}
		System.out.println(h);
		HashMap<Integer,Integer> h1= new HashMap<Integer,Integer>();
		for(int i=0;i<b.length;i++)
		{
			if(!h1.containsKey(b[i]))
			{
				h1.put(b[i],1);
			}
			else if(h1.containsKey(b[i]))
			{
				h1.put(b[i],h1.get(b[i])+1);
			}
		}
		System.out.println(h1);
		if(h.equals(h1))
			System.out.println("true");
		else
			System.out.println(false);


	}
}