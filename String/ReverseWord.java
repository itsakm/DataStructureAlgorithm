class ReverseWord{
	public static void main(String[] args) {
		String s="pqr.mno";
		int i=0;
		String str="";
		String str1[]=new String[2000];
		int j=0;
		while(i<s.length())
		{
			if(s.charAt(i)=='.')
			{
				
				str1[j]=str;
				str="";
				j++;
			}
			else
				str=str+s.charAt(i);
			i++; 
		}
		
		str1[j]=str;
		String x="";
		for(int k=j;k>=0;k--){
			if(k==0)
				x+=str1[k];
			else
				x+=str1[k]+".";
		}
		System.out.println(x);
		
	}
}