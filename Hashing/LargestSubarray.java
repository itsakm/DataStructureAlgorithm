class LargestSubarray
{
	public static void main(String[] args) {
		int a[]={15,-2,2,-8,1,7,10,23};
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			int sum=a[i];
			int k=1;
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				System.out.println("sum="+sum);
				k++;
				if(sum==0)
				{
					System.out.println("k="+k);
					if(k>=max)
						max=k;
				}
				
			}
		}
		System.out.println("max="+max);
	}
}