class Triplet
{
	public static void main(String[] args) {
		int a[]={9,8,6,5,4,2,1};
		int x=15;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==x){
						System.out.println("yes");
						count++;
					}
					//System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}
		System.out.println(count);

	}
}