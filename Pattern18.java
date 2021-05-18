package logical;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a++);
			}
			System.out.println();
		}

	}
}
//1
//23
//456
//78910
