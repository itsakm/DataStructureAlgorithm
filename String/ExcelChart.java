class ExcelChart
{
	public static void main(String[] args) {
		int n=52;
	StringBuilder s= new StringBuilder();
	while(n>0)
	{
		int rem=n%26;
		if(rem==0)
		{
			s.append("Z");
			n=(n/26)-1;
		}
		else
		{
			s.append((char)((rem-1)+'A'));
			n=n/26;
		}

	}
	System.out.println(s.reverse());
		
	}
	
}