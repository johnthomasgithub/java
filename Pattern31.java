package logical;
import java.util.*;
public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m=1;
		for(int i=1;i<=7;i+=2)
		{
			for(int j=1;j<=i;j++)
			{
				if((j%2==0))
				{
					System.out.print("*");
				}else
					System.out.print(m);
			}
			System.out.println();
			m++;
		}
		m=4;
		for(int i=7;i>=1;i-=2)
		{
			for(int j=7;j>=i;j--)
			{
				if((j%2==0))
				{
					System.out.print("*");
				}else
					System.out.print(m);
			}
			System.out.println();
			m++;
		}

	}

}
