import java.util.*;
class Isomorphic
{
	public static void main(String[] args) {
		String sa="aab";
		String sb="xxy";
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<sa.length();i++)
		{
			if(!(h.containsKey(sa.charAt(i))))
			{
				h.put(sa.charAt(i),i);
			}
		}
		for (Map.Entry me : h.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        System.out.println(h.size());
        HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
        for(int i=0;i<sb.length();i++)
		{
			if(!(h1.containsKey(sb.charAt(i))))
			{
				h1.put(sb.charAt(i),i);
			}
		}
		for (Map.Entry me : h1.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }
        System.out.println(h1.size());
        if(h.size()==h1.size())
        {
        	
        }
	}
}