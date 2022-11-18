import java.util.*;
class movnegleft
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]={1, -1, 3, 2, -7, -5, 11, 6};
		int n=a.length;
		int l=0;
		int h=n-1;
		while(l<=h)
		{
			if(a[l]>=0)
			{
				l++;
			}
			else if(a[l]<0)
			{
				int temp=a[h];
				a[h]=a[l];
				a[l]=temp;
				l++;
				h--;
			}
		}
		for(int i=0;i<n;i++)
				System.out.println(a[i]);

	}
}