class similiarelement
{
	public static void main(String[] args) {
		int a[]={1,3,5,7,8,2,5,7};
		int n=a.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					continue;
				if((a[i]==(a[j]+1))|| ((a[i]+1)==a[j]))
				{
					count++;
					for(int k=0;k<n;k++)
					{
						if(j==k && j==i)
							continue;
						if((a[j]==(a[k]+1))|| ((a[j]+1)==a[k]))
						{
							
								count=count+2;
							
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}