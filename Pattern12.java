package logical;
import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		for(int i=0;i<n;i++)
		{
			if(i%2 == 0) {
				m = 1;
				for(int k=i;k<n;k++)
				{
					System.out.print(m++);
				}
			}else {
				m = n-i;
				for(int j=i;j<n;j++)
				{
					System.out.print(m--);
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