import java.util.*;
class FibbonacciIterativeDP
{
	public static int fib(int n)
	{
		int dp[] = new int[n+1];
		Arrays.fill(dp,-1);
		dp[0] =0;
		dp[1] = 1;
		for(int i=2;i<=n;i++)
			dp[i] = dp[i-1]+dp[i-2];

		for(int i=0;i<n;i++)
			System.out.println(dp[i]);
		return dp[n-1];
	}
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
}