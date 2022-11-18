class PowerOf2
{
	public static void main(String[] args) {
		long n=256;
		if(n==1)
			System.out.println("Turu");
		long a=1;
		int flag=0;
		while(a<=n)
		{
			if(a==n)
				flag=1;
			a=a<<1;
			System.out.println(a);
		}
		System.out.println(flag);
	}
}