package logical;
import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=7;i>=1;i-=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}





//1234567
//12345
//123
//1