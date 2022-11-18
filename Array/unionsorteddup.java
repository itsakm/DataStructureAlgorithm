class unionsorteddup
{
	public static void main(String[] args) {
		int a[]={1, 2, 2, 2, 3};
		int b[]={2, 3, 4, 5};
		int m=a[a.length-1];//finding the max element of the arrays
		int n=b[b.length-1];
		int ans=0;
		if(m>n)
			ans=m;
		else
			ans=n;
		int newtab[]=new int[ans+1];
		int u[]=new int[(a.length+b.length)];
		int k=0;
		u[k]=a[0];
		++newtab[a[0]];
		for(int i=1;i<a.length;i++){
			if(a[i]!=a[i-1]){
				u[++k]=a[i];
				++newtab[a[i]];
			}	
		}
		for(int j=0;j<b.length;j++)
		{

			if(newtab[b[j]]==0)
			{
				u[++k]=b[j];
				++newtab[b[j]];
			}
		}
		for(int i=0;i<=k;i++)
			System.out.println(u[i]);


	}
}