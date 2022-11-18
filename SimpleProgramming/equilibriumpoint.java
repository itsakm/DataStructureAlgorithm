class equilibriumpoint//O(n*n)
{
	public static void main(String[] args) {
		int a[]={1,3,5,2,2};
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			int leftsum=0,rightsum=0;
			for(int j=0;j<i;j++)
			{
				leftsum=leftsum+a[j];
			}
			for(int j=i+1;j<n;j++)
			{
				rightsum=rightsum+a[j];
			}
			if(leftsum==rightsum)
			{
				System.out.println(i);
				break;
			}
		}
	}
}