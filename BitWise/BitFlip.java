class BitFlip
{
	public static void main(String[] args) {
		int a=34;
		int b=7;
		String a1=Integer.toBinaryString(a);
		String b1=Integer.toBinaryString(b);
		System.out.println(a1);
		System.out.println(b1);
		int i=a1.length()-1;
		int j=b1.length()-1;
		int count=0;
		while(i>=0 && j>=0)
		{
			System.out.println("a1["+i+"]="+a1.charAt(i));
			System.out.println("b1["+j+"]="+b1.charAt(j));
			if(a1.charAt(i)!=b1.charAt(j))
				count++;
			i--;
			j--;
		}
		if(i==(-1))
		{
			for(int m=j;m>=0;m--)
			{
				System.out.println(b1.charAt(m));
				if(b1.charAt(m)=='1')
					count++;
			}
			
		}
		else if(j==(-1))
		{
			for(int m=i;m>=0;m--)
			{
				System.out.println(b1.charAt(m));
				if(a1.charAt(m)=='1')
					count++;
			}
			
		}
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("count="+count);
	}
}