package logical;
import java.util.*;
public class NextGreater {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(st.isEmpty())
			{
				st.push(arr[i]);
			}
			else
			{
				
			}
		}
	}
}
