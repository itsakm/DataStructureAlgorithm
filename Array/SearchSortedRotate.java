class SearchSortedRotate
{
	static int pivot(int a[])
	{
		int n=a.length;
		int l=0,r=n-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if((mid==0 || a[mid-1]<=a[mid]) && (mid==1 || a[mid]>=a[mid+1]))
				return mid;
			else if(mid>0 && a[mid-1]>a[mid])
				r=mid-1;
			else 
				l=mid+1;
		}
		return -1;
		
	}
	static int pivotedbinary(int a[])
	{
		int piv=pivot(a);
	}
	public static void main(String[] args) {
		int a[]={3,4,5,1,2};
		int x=2;

	}
}