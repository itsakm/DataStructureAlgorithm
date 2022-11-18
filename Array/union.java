class union
{
	public static void main(String[] args) {
		int a[]={7,1,5,2,3,6};
		int b[]={3,8,6,20,7};
		int u[]=new int[(a.length+b.length)];
		int i=0;
		for(i=0;i<a.length;i++)
			u[i]=a[i];
		for(int m=0;m<i;m++)
			System.out.println(u[m]);
		for(int j=0;j<b.length;j++)
		{
			int flag=0;
			for(int k=0;k<a.length;k++)
			{
				System.out.println("b[j]="+b[j]+"a[k]="+a[k]);
				if(b[j]==a[k])
				{

					flag=1;
				}
			}
			if(flag==0)
			{
				u[i]=b[j];
				i++;
			}
		}
		for(int m=0;m<u.length;m++)
			System.out.println(u[m]);
	}
}