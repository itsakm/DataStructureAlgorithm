class GrayToBinary
{
	public static void main(String[] args) {
		int n=15;
		String bin=Integer.toBinaryString(n);
		System.out.println(Integer.toBinaryString(n));
		String s="";
		s=s+bin.charAt(0);
		int i=1;
		int j=0;
		while(i<bin.length())
		{
			int a=bin.charAt(i)-48;
			int b=s.charAt(j)-48;
			System.out.println("bin[i]="+a);
			System.out.println("s[j]="+b);
			int xor=a^b;
			String ch=Integer.toString(xor);
			System.out.println(ch);
			s=s+ch;
			i++;
			j++;
		}
		 System.out.println(s);
	}
}