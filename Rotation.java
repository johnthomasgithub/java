package logical;
import java.util.*;
public class Rotation {
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int rotate=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
    	arr[i]=sc.nextInt();
    	int k=0;
    	for(int i=0;i<rotate;i++)
    	{
    		int temp=arr[k];
    		for(int j=0;j<arr.length-1;j++)
    		{
    			arr[j]=arr[j+1];
    		}
    		arr[arr.length-1]=temp;
    		//k++;
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
	
	
	
	
}
