import java.util.*;
class BalanceParenthesis
{
	public static void main(String[] args) {
		Stack<Character> st= new Stack<Character>();
		String s="[()()()}";
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)==40 ||(int)s.charAt(i)==91||(int)s.charAt(i)==123){
				System.out.println((s.charAt(i)));
				st.push(s.charAt(i));
			}
			if((int)s.charAt(i)==41 ||(int)s.charAt(i)==93||(int)s.charAt(i)==125)
			{
				System.out.println(s.charAt(i));
				int a=(int)st.peek();
				if(((int)s.charAt(i)==41 && a==40) || ((int)s.charAt(i)==93 && a==91) || ((int)s.charAt(i)==125 && a==123))
				{
					st.pop();
				}

				System.out.println(a);
			}
			//st.push()
		}
		System.out.println(st.size());

	}
}