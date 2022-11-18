import java.util.*;
class LongestCommonSequence
{
	public static void main(String[] args) {
		int a[]={28,99,43,46,68,40,22,11,10,5,1,61,30,78,5,20,36,44,26,22,65,8,16};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		int count=1;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(!h.containsKey(a[i]))
			{
				h.put(a[i],i);
			}
			
		}
		int b[]=new int[h.size()];
		int i=0;
		for(Integer k : h.keySet())
		{
			b[i++]=k;
		}
		for(int j=1;j<b.length;j++)
		{
			if((b[j]-b[j-1])==1)
				count++;
			else if((b[j]-b[j-1])!=1)
			{
				if(count>=max)
				{
					max=count;
					count=1;
				}
				else
				{
					count=1;
				}
				
			}
		}
		System.out.println("max="+max);
		System.out.println(h);
		
	}
}