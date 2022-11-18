import java.util.*;
import java.lang.*;

class recursiveseq
{
	public static long findA(long n,long b[],long c[],int k)
	{
		if(n<=k)
		{
			return b[(int)(n-1)];
		}
		else if(n>k)
		{
			long res=0;
			for(int i=1;i<=k;i++)
			{
				res+=c[i-1]*findA(n-i,b,c,k);
			}
			return res;
		}
		return 0;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			int k=sc.nextInt();
			long b[]=new long[k];
			for(int i=0;i<k;i++)
			{
				b[i]=sc.nextLong();
			}
			long c[]=new long[k];
			for(int i=0;i<k;i++)
			{
				c[i]=sc.nextLong();
			}
			long n=sc.nextLong();
			long res=findA(n,b,c,k);
			System.out.println(res);
		}
	}
}