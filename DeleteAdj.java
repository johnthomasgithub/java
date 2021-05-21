package logical;
import java.util.*;
public class DeleteAdj {

		public static void main(String args[])
		{
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		 Stack<Character> st = new Stack<Character>();
		 for(int i=0;i<str.length();i++)
		 {
			 char ch = str.charAt(i);
			 if(st.isEmpty())
				 st.push(ch);
			 else
			 {
				 if(ch == st.peek())
				 st.pop();
				 else
					 st.push(ch);
			 }
		 }
		 while(st.size()!=0) {
			 System.out.println(st.pop());
		 }
		}
}
