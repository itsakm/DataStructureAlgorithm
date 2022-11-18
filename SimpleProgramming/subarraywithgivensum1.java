class subarraywithgivensum
{
	public static void main(String[] args) {
		int  a[]={1,2,3,4,5,6,7,8,9,10};
		int n=a.length;
		int sum=15;
		int curr_sum=a[0];
		int start=0;
		for(int i=1;i<=n;i++)
		{
			while(curr_sum>sum && start<i-1)
			{
				curr_sum=curr_sum-a[start];
				start++;
			}
			if(curr_sum==sum)
			{
				System.out.println(start+"-"+(i-1));
			}
			if(i<n){
			curr_sum=curr_sum+a[i];
		}
		}
	}
}