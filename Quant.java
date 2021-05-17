package logical;
import java.util.*;
public class Quant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j=0, m=0;
		for(int i=1;i<=n;i++)
		{
			m = i;
			for( j=1;j<=i;j++)
				System.out.print(m++);
			m = m-2;
			for(int k=1;k<i;k++)
			System.out.print(m--);
			System.out.println();
		}
	}
}
