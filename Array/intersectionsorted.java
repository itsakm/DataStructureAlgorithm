class intersectionsorted
{
	public static void main(String[] args) {
		int a[]={1, 2, 2, 3,3, 4};
		int b[]={2, 2,3, 4, 6, 7, 8};
		int i=0,j=0,k=0;
		int m=a[a.length-1];
		int n=b[b.length-1];
		int ans=0;
		if(m>n)
			ans=m;
		else
			ans=n;
		System.out.println(ans);
		int newtab[]=new int[ans+1];
		int u[]=new int[(a.length+b.length)];
		System.out.println(ans);
		while(i<a.length && j<b.length)
		{
			System.out.println("i="+i);
			System.out.println("j="+j);
			System.out.println("a[i]="+a[i]);
			System.out.println("b[j]="+b[j]);
			if(a[i]<b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else if(a[i]==b[j])
			{
				System.out.println("Inside else if");
				if(newtab[a[i]]==0)
				{
					u[k]=a[i];
					System.out.println("u[k]="+u[k]);
					++newtab[a[i]];
					System.out.println("newtab[a[i]]="+newtab[a[i]]);
					k++;
					
					

				}
				i++;
				j++;
				
			}
		}
		for(int x=0;x<k;x++)
		{
			System.out.println(u[x]);
		}
	}
}