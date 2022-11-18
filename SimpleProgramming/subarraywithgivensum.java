class subarraywithgivensum //O(n^2)
{
	public static void main(String[] args) {
		int  a[]={1,2,3,4,5,6,7,8,9,10};
		int n=a.length;
		int sum=15;
		for(int i=0;i<n;i++)
		{
			int curr_sum=a[i];
			for(int j=i+1;j<=n;j++)
			{
				if(j==n)
					break;
				curr_sum=curr_sum+a[j];
				if(curr_sum==sum)
				{
					System.out.println((i+1)+"-"+(j+1));
				}
			}
		}
	}

}