
class HelpClassMates
{
	public static void main(String[] args) {
		int a[]={3,8,5,2,25};
		int res[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int flag=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]){
					flag=1;
					res[i]=a[j];
					System.out.println(a[j]);
					break;
				}
				
			}
			if(flag==0)
			{
				res[i]=-1;
				System.out.println(-1);
			}
		}
		for(int i=0;i<res.length;i++)
			System.out.println(res[i]);
	}
}