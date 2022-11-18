import java.util.*;
class microarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while((t--)!=0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long a[]=new long[(int)n];
            for(long i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            
            long min=a[0];
            for(long i=1;i<n;i++)
            {
                if(a[i]<min)
                    min=a[i];
            }
            System.out.println(min);
        }

    }
}
