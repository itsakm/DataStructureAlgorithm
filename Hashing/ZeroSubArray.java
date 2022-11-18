import java.util.*;//O(n^3)
class ZeroSubArray
{
	public static void main(String[] args) {
		int a[]={6,-1,-3,4,-2,2,4,6,-12,-7};
		int count=0;
		for(int k=0;k<a.length;k++){

			
		for(int i=k;i<a.length;i++)
		{
			int sum=0;
			//System.out.print(a[i]+" ");
			for(int j=k;j<=i;j++)
			{
				sum=sum+a[j];
				System.out.print(a[j]+" ");
			}
			if(sum==0)
				count++;
			System.out.println();
		}
		}	
		System.out.println("count="+count);
	}
}