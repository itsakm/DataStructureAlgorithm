class ValidIP
{
	public static void main(String[] args) {
		String s="222.111.111.111";
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
		for(int k=0;k<=j;k++)
			System.out.println(str1[k]);
		System.out.println(j);
		int flag=0;
		if(j==3){
			System.out.println("yes");
			for(int k=0;k<=j;k++)
			{
				int temp=Integer.parseInt(str1[k]);
				System.out.println("temp="+temp);
				if(temp>=0 && temp<=255)
					flag++;
				System.out.println("flag="+flag);
			}
			if(flag==j+1)
				System.out.println("yes");

		}
		else
			System.out.println("no");
	}
}