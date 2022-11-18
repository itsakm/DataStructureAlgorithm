class BinaryToGray
{
	public static void main(String[] args) {
		int n=12;
		String bin=Integer.toBinaryString(n);
		
		String s="";
		s=s+bin.charAt(0);
				for(int i=0;i<bin.length()-1;i++)
		{
			int a=(bin.charAt(i))-48;
			int b=(bin.charAt(i+1))-48;

			
			int xor=(a^b);
			
			String ch=Integer.toString(xor);
			
			s=s+ch;
			//System.out.println(bin.charAt(i));
			//s=s+()
		}
		System.out.println(s);
		System.out.println(Integer.parseInt(s,2));


	}
}