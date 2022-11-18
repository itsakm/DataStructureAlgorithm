class CountSetBits
{
	public static void main(String[] args) {
		int j=17;
		int count=0;
		System.out.println(Integer.toBinaryString(j));
		for(int i=1;i<=j;i++)
		{

			int n=i;
		while(n>0)
		{
			System.out.println("count="+(n&1));
			count=count+(n&1);
			n=n>>1;
			
			System.out.println(Integer.toBinaryString(n));
		}
	}
		System.out.println(count);
	}
}