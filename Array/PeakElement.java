class PeakElement
{
	static int findPeak(int a[])
	{
		int l=0,r=a.length-1;
		while(l<=r)
		{
			int mid=(l+r)/2;
			if((mid==0 || a[mid-1]<=a[mid] )&& (mid==(a.length-1) || a[mid]>=a[mid+1])){
				return mid;
			}
			else if(mid>0 && a[mid-1]>a[mid]){
				r=mid-1;
			}
			else{
				l=mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int a[]={1,13};
		System.out.println(findPeak(a));
		

		
	}
}