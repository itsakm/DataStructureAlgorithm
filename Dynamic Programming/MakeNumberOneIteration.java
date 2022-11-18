class MakeNumberOneIteration
{
	public static int steps(int n)
	{
		int dp[] = new int[n+1];
		dp[0]=0;
		dp[1]=0;
		for(int i=2;i<=n;i++)
		{
			int smallAns1 = dp[i-1];
			int smallAns2 = Integer.MAX_VALUE;
			if(i%2==0)
			{
				smallAns2 = dp[i/2];
			}
			int smallAns3 = Integer.MAX_VALUE;
			if(i%3==0)
			{
				smallAns3 = dp[i/3];
			}
			dp[i]=1+Math.min(smallAns1,Math.min(smallAns2,smallAns3));
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println(steps(10));
		
	}
}