package logical;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(m);
			}
			m--;
			System.out.println();
		}
	}

}

//
//5
//44
//333
//2222
//11111