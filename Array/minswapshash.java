import java.util.*;
class minswapshash
{
	public static void main(String[] args) {
		int a[]={101, 758, 315, 730, 472, 
                        619, 460, 479};
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		Arrays.sort(temp);
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int ans=0;
		for(int i=0;i<a.length;i++)
			hm.put(a[i],i);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=temp[i])
			{
				ans++;
				int init=a[i];
				int pos=hm.get(temp[i]);
				int temp1=a[i];
				a[i]=a[pos];
				a[pos]=temp1;
				hm.put(init,hm.get(temp[i]));
				hm.put(temp[i],i);
			}
		}
		System.out.println("count="+ans);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}