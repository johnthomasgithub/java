package logical;

import java.util.*;

public class SubArray {
    public static void reverseSub(int arr[],int l,int r)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i == l)
    		{
    		for(int j=r;j>=l;j--)
    		System.out.print(arr[j]);
    		i=r;
    		}else
    			System.out.print(arr[i]);
    	}
    }
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int arr[] = {1,2,3,4,5,6,7};
       int l = sc.nextInt();
       int r = sc.nextInt();
       int left = 0,right = 0;
       
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i] == l)
    		   left = i;
    		if(arr[i]==r)
    			right = i;
       }
       reverseSub(arr,left,right);
	}

}
