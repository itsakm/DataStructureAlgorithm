import java.util.*;
class NonRepeatedElement
{
	public static void main(String[] args) {
		int a[]={1,1,2,2,3,3,4,5,6,7};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!h.containsKey(a[i]))
			{
				h.put(a[i],1);	
			}
			else if(h.containsKey(a[i]))
			{
				h.put(a[i],(h.get(a[i])+1));
			}			
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for (Map.Entry<Integer,Integer> et : h.entrySet())
		{
			if(et.getValue()==1)
			{
				al.add(et.getKey());
			}
		}
		System.out.println(al);
		System.out.println(h);
	}
}