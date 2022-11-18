class Panagram
{
	public static void main(String[] args) {
		String str="Abc";
		//A=65 a=97;z=122;
		int c[]=new int[256];
		String s="";
		for(int i=0;i<str.length();i++)
		{
			c[str.charAt(i)]++;
			c[str.charAt(i)+32]++;
		}
		for(int i=0;i<c.length;i++)
			System.out.println(i+" "+(char)i+"="+c[i]+" ");
		for(int i=97;i<=122;i++)
		{
			if(c[i]==0){
				s=s+(char)i;
				System.out.println((char)i);
			}
		}
		System.out.println(s);
	}
}