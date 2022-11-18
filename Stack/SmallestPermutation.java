import java.util.*;
class SmallestPermutation
{
	public static void main(String[] args) {
		int n=456;
		ArrayList<Integer> a=new ArrayList<Integer>();
		while(n>0)
		{
			a.add(n%10);
			//System.out.println(n%10);
			n=n/10;
		}
		ArrayList<Integer> b = (ArrayList<Integer>)a.clone();
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
		if(count==a.size())
			System.out.println("yes");
		else
			System.out.println("no");
		//for(int i=0;i<a.)
	}
}