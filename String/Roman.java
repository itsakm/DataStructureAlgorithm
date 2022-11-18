class Roman
{
	public static void main(String[] args) {
		int n=3549;
		int num[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String sym[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int i=12;
		String str="";
		while(n>0)
		{
			int div=n/num[i];
			n=n%num[i];
			while((div--)!=0)
			{
				str=str+sym[i];
			}
			i--;
		}
		System.out.println(str);
	}
}