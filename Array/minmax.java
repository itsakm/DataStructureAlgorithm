import java.util.*;
class minmax
{
	public static void main(String[] args) {
		int a[]={5,4,2,1};
		int n=a.length;
		pair p=new pair();
		if(n==1)
		{
			p.min=a[0];
			p.max=a[0];
		}
		else if(n>1)
		{
			if(a[0]>a[1])
			{
				p.max=a[0];
				p.min=a[1];
			}
			else
			{
				p.max=a[1];
				p.min=a[0];
			}
			for(int i=2;i<n;i++)
			{
				if(a[i]>p.max)
				{
					p.max=a[i];
				}
				if(a[i]<p.min)
				{
					p.min=a[i];
				}
			}
			
		}
		System.out.println(p.max+" "+p.min);


	}
}
class pair
{
	int max;
	int min;
}