package logical;
import java.util.*;
public class Pattern17 {
	
	
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=n;i>=1;i--)
			{
				int m = i;
				for(int j=n;j>=i;j--)
				{
					System.out.print(m++);
				}
				for(int k=1;k<=i-1;k++)
				{
					System.out.print(n);
				}
				System.out.println();
			}
		}
}

//55555
//45555
//34555
//23455
//12345