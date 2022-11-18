import java.util.*;
class minswapsN
{
	public static void main(String[] args) {
		int a[]={8,9,16,15,8,16,15};
		int temp[]=new int[a.length];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		Arrays.sort(temp);
		int count=0;
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=temp[i])
			{
				count++;
				int pos=0;
				for(int j=0;j<temp.length;j++)
				{
					if(temp[j]==a[i])
					{
						pos=j;
					}
				}
				int temp1=a[i];
				a[i]=a[pos];
				a[pos]=temp1;
			}
		}
		System.out.println("count="+count);
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);

	}
}