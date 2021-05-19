package logical;
import java.util.*;
public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int count = 1;
		int j=0;
		for(int i=0;i<n;i++)
		{
			for(j=i;j<n-i;j++)
				arr[i][j] = count++;
			for(j = i+1;j<=n-i-1;j++) 
				arr[j][n-i-1] = count++;
			for(j=n-i-2;j>=i;j--)
				arr[n-i-1][j] = count++;
			for(j=n-2-i;j>i;j--)
				arr[j][i] = count++;
		}
		for(int i=0;i<n;i++)
		{
			for(j = 0;j<n;j++)
			{
				if(arr[i][j] <10)
					System.out.print(arr[i][j]+"  ");
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
