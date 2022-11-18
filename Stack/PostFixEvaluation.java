import java.util.*;
class PostFixEvaluation
{
	public static void main(String[] args) {
		String s="231*+9-";
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/')
			{
				int b=st.pop();
				int a=st.pop();
				System.out.println(a+" "+b);
				if(s.charAt(i)=='+')
				{
					st.push(a+b);
				}
				if(s.charAt(i)=='-')
				{
					st.push(a-b);
				}
				if(s.charAt(i)=='*')
				{
					st.push(a*b);
					System.out.println(a*b);

				}
				if(s.charAt(i)=='/')
				{
					st.push(a/b);
				}
			}
			else
			{
				System.out.println(s.charAt(i)-48);
				st.push(s.charAt(i)-48);
			}
			System.out.println(st);
		}
	}
}