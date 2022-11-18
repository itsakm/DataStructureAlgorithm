import java.util.concurrent.TimeUnit;
class arrayrotat
{
	public static void leftrotate(int a[],int d,int n)
	{

		d=d%n;//for d>n
		int g_cd=gcd(d,n);
		for(int i=0;i<g_cd;i++)
		{
			int temp=a[i];
			int j=i;
			while(true)
			{
				int k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				a[j]=a[k];
				j=k;
			}
			a[j]=temp;
		}
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
	}
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int c=35267;
		int d=2000;
		int a[]=new int[c];
		for(int i=0;i<c;i++)
			a[i]=i+1;
		leftrotate(a,d,c);
		long endTime = System.nanoTime();
		System.out.println((endTime-startTime)/1000000000);
		/*for(int i=0;i<c;i++)
			System.out.print(a[i]+" ");	*/
	}
}