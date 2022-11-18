class longestPalindrome1
{
	public static void main(String[] args) {
		StringBuilder s= new StringBuilder("aaaabbaa");
		int max=0;
		String res="";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println("i="+i);
			for(int j=i;j<=s.length();j++)
			{
				System.out.println("j="+j);
				StringBuilder s1=new StringBuilder(s.substring(i,j));

				System.out.println("substring="+s.substring(i,j));
			
				System.out.println("reverse="+s1.reverse());
				if(s1.toString().equals((s1.reverse()).toString())){
					System.out.println("yes");
					if(s1.length()>=max){
						max=s1.length();
						res=s1.toString();
					}
				}
				System.out.println("max="+max);
			}
		}
		System.out.println("max="+max);
		System.out.println("res="+res);

	}
}