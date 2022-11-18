import java.util.*; 
class RullingPair
{
	public static int digitsum(int a)
	{
		int sum=0;	
		while(a>0)
		{
			sum=sum+a%10;
			a=a/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[]={55,23,32,46,88};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			h.put(a[i],digitsum(a[i]));
		}
		for (Map.Entry<Integer,Integer> et : h.entrySet())
		{
			System.out.println(et.getKey()+" "+et.getValue());
			for (Map.Entry<Integer,Integer> et : h.entrySet())
			{
				System.out.println(et.getKey()+" "+et.getValue());
				
				

				/*if(et.getValue()==1)
				{
					al.add(et.getKey());
				}*/
			}
			

			/*if(et.getValue()==1)
			{
				al.add(et.getKey());
			}*/
		}
		

	}
}