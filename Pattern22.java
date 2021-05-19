package logical;
import java.util.*;
public class Pattern22 {
	
	public static void main(String[] args)
	{
		int i=0,j=0,k=0;
		for( i=4;i>=1;i--)
		{
			for( j=1;j<=4;j++)
			{
				if(j<=i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			for( j=4;j>=1;j--)
			{
				if(j<=i)
					System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
		}
		}
}
//12344321
//123**321
//12****21
//1******1

