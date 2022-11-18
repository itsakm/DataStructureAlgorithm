import java.util.*;
class FibbonacciMemoization
{
	public static int fib(int n,int dp[])
	{
		if(n ==0 || n==1)
			return n;
		int smallAns1;
		int smallAns2;

		if(dp[n-1] == -1)
		{
			smallAns1 = fib(n-1,dp);
			dp[n-1] = smallAns1;
		}
		else 
		{
			smallAns1 = dp[n-1];
		}
		if(dp[n-2] == -1)
		{
			smallAns2 = fib(n-1,dp);
			dp[n-2] = smallAns2;
		}
		else 
		{
			smallAns2 = dp[n-2];
		}
		return smallAns1 + smallAns2;
	}
	public static void main(String[] args) {
		int n=4;
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);

		System.out.println(fib(n,dp));
		
	}
}