package logical;
import java.util.*;
public class ReverseStack {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		String s = "()()()";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(st.isEmpty())
				st.push(ch);
			else
			{
				char p = st.peek();
				if(p == '(' && ch == ')') {
					System.out.print(p + ""+ ch);
					st.pop();
				}
				else if(p == '[' && ch == ']') {
					System.out.print(p + ""+ ch);
					st.pop();
				}
				else if(p == '{' && ch == '}') {
					System.out.print(p + ""+ ch);
					st.pop();
				}
				else
					st.push(ch);
			}
		}
		System.out.println();
		if(st.isEmpty())
			System.out.print(true);
		else
			System.out.print(false);
	}
}
