package logical;
import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for(int i=1;i<=n;i++)
		{
			if(i %2==0)
				m = 2;
			else
				m = 1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(m+" ");
				m+=2;
			}
			System.out.println();
		}
	}
}

//
//1 
//2 4 
//1 3 5 
//2 4 6 8 
//1 3 5 7 9 
