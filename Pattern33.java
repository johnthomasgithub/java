package logical;
import java.util.*;
public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<i)
					System.out.print(" ");
					else
						System.out.print("* ");
			}
			System.out.println();
		}

	}

}
