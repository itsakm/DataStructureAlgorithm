class unionsorted
{
	public static void main(String[] args) {
		int a[]={2, 5, 6};
		int b[]={4, 6, 8, 10};
		int i=0,j=0,k=0;
		int u[]=new int[(a.length+b.length)];
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				u[k]=a[i];
				i++;
				k++;
			}
			else if(a[i]>b[j])
			{
				u[k]=b[j];
				j++;
				k++;
			}
			else if(a[i]==b[j])
			{
				u[k]=a[i];
				i++;
				j++;
				k++;
			}

		}
		while(i<a.length)
		{
			u[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			u[k]=b[j];
			j++;
			k++;
		}

		for(int m=0;m<k;m++)
		{
			System.out.println(u[m]);
		}

	}
}