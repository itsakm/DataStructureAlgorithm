class MakuNumberOneRecur
{
	public static int steps(int n)
	{
		if(n==1)
			return 0;
		int smallAns1 = steps(n-1);
		int smallAns2=Integer.MAX_VALUE;
		int smallAns3=Integer.MAX_VALUE;
		if(n%2==0)
			smallAns2 = steps(n/2);
		if(n%3 ==0)
			smallAns3 = steps(n/3);

		return 1+Math.min(smallAns1,Math.min(smallAns2,smallAns3));
	}
	public static void main(String[] args) {
		System.out.println(steps(10));
	}
}