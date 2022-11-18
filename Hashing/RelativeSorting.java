import java.util.*;
class RelativeSorting
{
	public static void main(String[] args) {
		int a[]={2,1,2,5,7,1,9,3,6,8,8};
		int b[]={99,22,444,56};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					al.add(a[j]);
					a[j]=-1;
				}
			}
		}
		System.out.println(al.toString());
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
				al.add(a[i]);
		}
		System.out.println(al.toString());
	}
}