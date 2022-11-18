class BinaryCheck
{
	static 	boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0;i<str.length();i++)
	  {
	  	System.out.println(str.charAt(i));
	      if(str.charAt(i)!='0' &&  str.charAt(i)!='1')
	      {
	          return false;
	      }
	  }
	  return true;
	}
	public static void main(String[] args) {
		String str="111100110101100";
		System.out.println(isBinary(str));
		
	}
}