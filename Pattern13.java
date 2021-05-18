package logical;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=0;
		for(int i=1;i<=n;i++)
		{
			m=1;
			for(int j=i;j<2*n;j++)
			{
				System.out.print(m++);
			}
			System.out.println();
		}

	}

}
