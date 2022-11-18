import java.util.*;
class SmallestMissing
{
	static int findMissing(int a[], int n)
    {
       
       // Your code here
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(a[i]>=max)
            max=a[i];
       }
       System.out.println(max);
       boolean res[]=new boolean[max+1];
       for(int i=1;i<=max;i++)
       {    
           res[i]=false;
           
       }
       for(int i=0;i<n;i++)
       {
           if(a[i]>0)
           {
               res[a[i]]=true;
           }
       }
       for(int i=max;i>=1;i--)
       {
           if(res[i]==false)
            return i;
       }
       return max+1;
       
       
    }
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int []a= new int[(int)n];
		for(int i=0;i<n;i++)
		{
			a[(int)i]=sc.nextInt();
		}
		System.out.println(findMissing(a,n));

	}
}