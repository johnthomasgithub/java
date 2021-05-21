package logical;
import java.util.*;
public class RemoveDigitSmallestStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int k = sc.nextInt();
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			while(!st.isEmpty() && k>0 && st.peek() >ch)
			{
				st.pop();
				k--;
			}
			st.push(ch);
		}
		for(int i=0;i<k;i++)
		{
		st.pop();
		}
		StringBuffer sb = new StringBuffer();
		while(!st.isEmpty())
		{
			sb.append(st.pop());
		}
		sb.reverse();
		int res = Integer.parseInt(sb+"");
		System.out.println(res);
	}

}
