class sort012
{
	public static void main(String[] args) {
		int a[]={0,1,2,0,1,2};
		int n=a.length;
		int l=0,m=0,h=n-1;
		while(m<=h)
		{
			if(a[m]==0)
			{
				int temp=a[l];
				a[l]=a[m];
				a[m]=temp;
				l++;
				m++;
			}
			else if(a[m]==1)
			{
				m++;
			}
			else if(a[m]==2)
			{
				int temp=a[h];
				a[h]=a[m];
				a[m]=temp;
				h--;
			}
			for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);

	}
}