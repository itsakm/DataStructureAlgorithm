class StairCaseRecursion
{
	public static int stairCase(int n)
	{
		if(n==0||n==1)
			return 1;
		if(n==2)
			return 2;
		return stairCase(n-1)+stairCase(n-2)+stairCase(n-3);
	}
	public static void main(String[] args) {
		System.out.println(stairCase(4));
	}
}