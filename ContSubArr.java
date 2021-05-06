package logical;
import java.util.*;
public class ContSubArr {
    public static void findMaxSum(int[] arr)
    {
    	int cur = 0;
    	int max = 0;
    	cur = max = arr[0];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(cur<0)
    			cur = arr[i];
    		else
    			cur+=arr[i];
    		max = Math.max(max, cur);
    	}
    	System.out.print(max);
    }
	public static void main(String[] args) {
		findMaxSum(new int[] {-2,1,-3,4,-1,2,1,-5,4});
	}

}
