class LarNumWithGivenSum
{
	public static void main(String[] args) {
		int n = 5;
		int sum = 12;

		String res = "";
		for(int i =0;i<n ;i++)
		{
			if(sum>=9)
			{
				res = res + "9";
				sum = sum -9;
			}
			else
			{
				res = res + Integer.toString(sum);
				sum =0;
			}
			System.out.print(res +" ");
		}
		System.out.println(res);
	}
}