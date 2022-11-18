import java.util.*;
class CountDistinct
{
	public static void main(String[] args) {
		int a[]={1,2,1,3,4,2,3};
		int k=4;
		int i=0;
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		while((i+k)<=a.length)
		{
			int b[]=new int[k];
			for(int j=0;j<k;j++)
			{
				b[j]=a[i+j];
			}
			for(int j=0;j<k;j++)
			{
				System.out.print(b[j]+" ");
			}
			System.out.println();
			LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>();
			for (int x = 0; x < b.length; x++) {
			if (m.containsKey(b[x])) {
			m.put(b[x], m.get(b[x]) + 1);
			}
			else {
			m.put(b[x], 1);
			}
			}
			System.out.println(m);
			int count=0;
			for (Map.Entry<Integer,Integer> x : m.entrySet())
			if (x.getValue() == 1 || x.getValue()==2) {
				count++;
			}
			b1.add(count);
			i++;
		}
		System.out.println(b1);
	}
}