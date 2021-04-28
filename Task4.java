package logical;
import java.util.*;
public class Task4 {

	public static void main(String[] args) {
		int arr[] = {20,1,23,12,13};
		Arrays.sort(arr);
		int start = 0;
		int end = 0;
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+1 == arr[i+1])
				continue;
			else
			{
				start = arr[i];
				end = arr[i+1];
				for(int j=start+1;j<end;j++)
					li.add(j);
			}
			start = 0;
			end = 0;	
		}
		System.out.println(li);
		
	}

}
