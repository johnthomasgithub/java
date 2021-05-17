package logical;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int m = 1;
			for(int j=n;j>i;j--)
			{
				System.out.print(m++);
			}
			System.out.println();
		}
	}

}

//12345
//1234
//123
//12
//1
