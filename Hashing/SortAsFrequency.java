import java.util.*;//need to see its not completely solved.
class SortAsFrequency
{
	public static void main(String[] args) {
		Integer a[]={4,3,1,6,4,3,6,4};
		int b[][]=new int[a.length][2];
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		/*HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(!h.containsKey(a[i]))
			{
				h.put(a[i],1);
			}
			else if(h.containsKey(a[i]))
			{
				h.put(a[i],h.get(a[i])+1);
			}
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println(h.size());
		for(Map.Entry<Integer,Integer> x:h.entrySet())
		{
			al.add(x.getValue());
		}
		Collections.sort(al, Collections.reverseOrder());
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++)
		{
			if(h.containsValue(al.get(i)))
			{
				System.out.println(h.getKey(al.get(i)));
				//res.add(h.getKey(al.))
			}
			System.out.println(al.get(i));
		}
		System.out.println(al);
		System.out.println(h);	*/
	}
}