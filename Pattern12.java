package logical;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2 == 0)
			{
				int s = n-i;
				for(int k=1;k<=i;k++)
				{
					System.out.print(k);
				}
			}else
			{
				int m = 1;
				for(int j=i;j<=n;j++)
				{
					System.out.print(m++);
				}
			}
			System.out.println();
		}
	}
}

//12345
//4321
//123
//21
//1