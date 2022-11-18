class RightMostDif
{
	public static void main(String[] args) {
		int m=11;
		int n=9;
		String a=Integer.toBinaryString(m);
		String b= Integer.toBinaryString(n);
		System.out.println("a="+a);
		System.out.println("b="+b);
		int i=a.length()-1;
		int j=b.length()-1;
		int q=1;
		int res=0;
		while(i>=0 && j>=0)
		{
			System.out.println("a[i]="+a.charAt(i));
			System.out.println("b[j]="+b.charAt(j));
			if(a.charAt(i)!=b.charAt(j))
			{
				res=q;
				break;
			}
			i--;
			j--;
			q++;
		}
		System.out.println("q="+q);
		if(i==(-1))
		{
			for(int k=j;k>=0;k--)
			{
				if(b.charAt(k)=='1')
				{
					res=q;
					break;
				}
				q++;
			}
		}
		else if(j==(-1))
		{
			for(int k=i;k>=0;k--)
			{
				if(a.charAt(k)=='1')
				{
					res=q;
					break;
				}
				q++;
			}
		}
		System.out.println(res);
	}
}