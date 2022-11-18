import java.util.*;
class StairCaseMemoization
{
	public static int stairCase(int n,int dp[])
	{
		if(n==0||n==1)
			return 1;
		if(n == 2)
			return 2;
		int smallAns1;
		if(dp[n-1] == -1)
		{
			smallAns1 = stairCase(n-1,dp);
			dp[n-1] = smallAns1;
		}
		else 
		{

			smallAns1 = dp[n-1];
		}
		int smallAns2;
		if(dp[n-2] == -1)
		{
			smallAns2 = stairCase(n-2,dp);
			dp[n-2] = smallAns2;
		}
		else 
		{

			smallAns2 = dp[n-2];
		}
		int smallAns3;
		if(dp[n-3] == -1)
		{
			smallAns3 = stairCase(n-3,dp);
			dp[n-3] = smallAns3;
		}
		else 
		{

			smallAns3 = dp[n-3];
		}

		return smallAns3+smallAns1+smallAns2;
	}
	public static void main(String[] args) {
		int n=4;
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
		System.out.println(stairCase(n,dp));
	}
}