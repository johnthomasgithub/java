package logical;
import java.util.*;
public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	}
}
//
//
//1
//21
//321
//4321
//54321