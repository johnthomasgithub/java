package logical;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int m=n;
			m-=i;
			for(int j=0;j<=i;j++)
			{
				System.out.print(m++);
			}
			System.out.println();
		}
	}
}
//
//5
//45
//345
//2345
//12345

