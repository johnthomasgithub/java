package logical;
import java.util.*;
public class pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(m);
			}
			m--;
			System.out.println();
				
		}

	}
}
