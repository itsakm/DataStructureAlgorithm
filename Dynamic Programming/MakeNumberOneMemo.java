import java.util.*;
class MakeNumberOneMemo
{
	public static int steps(int n,int dp[])
	{
		if(n==1)
			return 0;
		int smallAns1;
		if(dp[n-1]==-1)
		{
			smallAns1 = steps(n-1,dp);
			dp[n-1]=smallAns1;
		}
		else 
		{
			smallAns1=dp[n-1];
		}
		int smallAns2=Integer.MAX_VALUE,smallAns3=Integer.MAX_VALUE;
		if(n%2==0)
		{
			if(dp[n/2]==-1)
			{
				smallAns2=steps(n/2,dp);
				dp[n/2]=smallAns2;
			}
			else 
			{
				smallAns2=dp[n/2];
			}
		}
		if(n%3==0)
		{
			if(dp[n/3]==-1)
			{
				smallAns3=steps(n/3,dp);
				dp[n/3]=smallAns3;
			}
			else 
			{
				smallAns3=dp[n/3];
			}
		}
		return 1+Math.min(smallAns1,Math.min(smallAns2,smallAns3));


	}
	public static void main(String[] args) {
		int n=10;
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
		System.out.println(steps(n,dp));
	}
}