class Wave{

    
    // Function to convert the given array to wave like array
    // arr: input array
    // n: size of the array
    public static void main(String[] args) {
    	int a[]={1,2,3,4,5};
    	int n=a.length;
    	for(int i=0;i<n;i++)
    	{
    		if(i%2==0 && i!=n-1)
    		{
    			int temp=a[i+1];
    			a[i+1]=a[i];
    			a[i]=temp;
    		}
    	}
    	for(int i=0;i<n;i++)
    		System.out.println(a[i]);
    }
    
}