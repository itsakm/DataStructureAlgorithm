import java.util.*;
class findmissing
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=84;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int size=arr.length;
		HashSet<Integer> h = new HashSet<>();
       int max=0;
       for(int i=0;i<size;i++)
       {
           if(arr[i]>=max)
              max=arr[i];
           if(arr[i]>0)
            h.add(arr[i]);
       }
       System.out.println(h);
       int rs=0;
       System.out.println(max);
       for(int i=1;i<=max+1;i++)
            if(!h.contains(i))
            {
                rs=i;
                break;
            }
       System.out.println(rs);
	}
}