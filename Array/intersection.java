class intersection
{
	public static void main(String[] args) {
		int a[]={7,1,5,2,3,6};
		int b[]={3,8,6,20,7};
		int u[]=new int[(a.length+b.length)];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					u[k]=a[i];
					k++;
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.println(u[i]);
		}
	}
}