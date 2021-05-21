package logical;
import java.util.*;
public class StackMin {
	public static int findMin(Stack<Integer> st,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			if(st.isEmpty())
				st.push(temp);
			else
			{
				if(temp<st.peek())
				{
					st.pop();
					st.push(temp);
				}
			}
		}		
		return st.peek();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
        System.out.print(findMin(st,arr));		
	}

}
