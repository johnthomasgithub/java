package logical;
import java.util.*;
public class Pattern17 {
	
	
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=n;i>=1;i--)
			{
				int m = i;
				for(int j=1;j<=n;j++)
				{
					if(m<=n)
					System.out.print(m++);
					else
						System.out.print("5");
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