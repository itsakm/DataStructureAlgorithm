class StringMatch
{
	public static void main(String[] args) {
		String str="abcabcabcd";
		String tr="abcd";
		int j=0;
		int flag=-1;
		for(int i=0;i<str.length();i++)
		{
			System.out.println("str.charAt(i)"+str.charAt(i));
			System.out.println("i+tr.length()="+(i+tr.length()));
			if(((i+tr.length())<=str.length()) && (str.charAt(i)==tr.charAt(0)))
			{
				String temp=str.substring(i,i+tr.length());
				System.out.println(str.substring(i,i+tr.length()));
				if(temp.equals(tr)){
					flag=i;
				break;
				}
				
			}
			
		}
		System.out.println(flag);

	}

}