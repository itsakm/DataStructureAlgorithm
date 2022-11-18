class MaxOccurChar
{
	public static void main(String[] args) {
		String str = "zxcvcvzx";
		int c[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			c[str.charAt(i)]++;
		}
		for(int i=0;i<c.length;i++)
			System.out.println(i+" "+(char)i+"="+c[i]+" ");
		int max=-1;
		char res=' ';
		for(int i=255;i>=0;i--)
		{
			System.out.println("i="+i);
			if(max<=c[i]){
				max=c[i];
				System.out.println("max="+max);
				res=(char)i;
				System.out.println("res="+res);
			}
		}
		System.out.println(res);
	}
}