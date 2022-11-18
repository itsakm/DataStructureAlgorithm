import java.util.*;
class StringReverse
{
	public static void main(String[] args) {
		String s="hgfsdahgasd";
		Stack<Character> st= new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			st.push(s.charAt(i));
		}
		System.out.println(st);
		String res="";
		for(int i=0;i<s.length();i++)
		{
			res=res+(char)st.pop();
		}
		System.out.println(res);
	}
}