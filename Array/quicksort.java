class quicksort
{
	public static int  partition(int a[],int l,int h)
	{
		int piv=a[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j]<=piv)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int temp=a[i+1];
		a[i+1]=a[h];
		a[h]=temp;
		return i+1;
	}
	public static void sort(int a[],int l,int h)
	{
		if(l<h)
		{
			int p=partition(a,l,h);
			sort(a,l,p-1);
			sort(a,p+1,h);
		}
	}
	public static void main(String[] args) {
		
		int arr[]={3,7,38,12,32,34,8,11,2,5,9,21};
		int l=0;
		int r=arr.length-1;
		sort(arr,l,r);
		
		for(int x=0;x<arr.length;x++)
			System.out.println(" "+arr[x]);
	}
}