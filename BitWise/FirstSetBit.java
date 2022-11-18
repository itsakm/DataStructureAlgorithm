class FirstSetBit
{
	public static void main(String[] args) {
		int n=18 ;
		int res=0;
		int i=1;
		while(n>0)
		{
			int rem=n%2;
			if(rem==1)
			{
				res=i;
				break;

			}
			
			n=n/2;
			i++;


		}
		System.out.println(res);
	}
}