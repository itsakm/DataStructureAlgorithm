import java.util.*;
class PasscodeProtected
{
	public static void main(String[] args) {
		long m=666;
		int res=0;
		for(long x=1;x<=m;x++)
		{
			long n=x;
			ArrayList<Long> a=new ArrayList<Long>();
			while(n>0)
			{
				a.add(n%10);
				//System.out.println(n%10);
				n=n/10;
			}
			ArrayList<Long> b = (ArrayList<Long>)a.clone();
			for(int i=0;i<a.size()/2;i++)
			{
				int temp=a.get(i);
				a.put()
			}
			Collections.reverse(a); 	
			System.out.println(a);
			Collections.copy(b,a);
			System.out.println(b);
			Collections.sort(a);
			System.out.println(a);
			int count=0;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)==b.get(i))
					count++;
			}
			if(count==a.size()){
				System.out.println(x+"yes");
				res++;
			}
			else
				System.out.println(x+"no");
		}
		System.out.println(res);

	}
}