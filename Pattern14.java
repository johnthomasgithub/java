package logical;
import java.util.*;
public class Pattern14 {

	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
//
//1
//01
//101
//0101