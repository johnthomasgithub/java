package logical;
import java.util.*;
public class NextGreaterStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int arr[] = {7,8,1,4};
		int op[] = new int[arr.length];
		Arrays.fill(op, -1);
		int ind=0;
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			if(st.isEmpty())
				st.push(temp);
			else
			{
				if(temp > st.peek())
				{
					st.pop();
					st.push(temp);
					op[ind++] = st.peek();
				}
				else {
					st.pop();
					st.push(temp);
					ind++;
				}
			}
		}
		System.out.print(op);
	}
}
