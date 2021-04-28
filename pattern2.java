package logical;
import java.util.*;
public class pattern2 {
     public static void main(String args[])
     {
    	Scanner sc=new Scanner(System.in);
    	int row=sc.nextInt();
    	for(int i=1;i<=row;i++)
    	{
    		for(int j=i;j<row;j++)
    		{
    			System.out.print(" ");
    		}
    		for(int k=1;k<=i;k++)
    		{
    			System.out.print("*");
    		}
    		for(int l=1;l<=i-1;l++)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i=1;i<=row;i++)
    	{
    		for(int j=1;j<=i;j++) 
    		{
    			System.out.print(" ");
    		}
    		for(int k=row-1;k>=i;k--)
    		{
    			System.out.print("*");
    		}
    		for(int l=row-1;l>i;l--)
    		{
    			System.out.print("*");
    		}
    		System.out.println();
    	}
     }
}
