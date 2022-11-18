import java.util.*;
class ZeroSubArray1
{
	public static void main(String[] args) {
		int a[]={0,0,5,5,0,0};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		int sum=0;
		int count=0;
		h.put(0,1);
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			if(!h.containsKey(sum))
			{
				h.put(sum,1);	
			}
			else if(h.containsKey(sum))
			{
				count=count+h.get(sum);
				h.put(sum,(h.get(sum)+1));
			}
		}
		System.out.println(count);

	}
}