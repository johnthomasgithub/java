package logical;
import java.util.*;
public class TwodArrayIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		String arr[][] = new String[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				String str = i+""+j;
				arr[i][j] = str;
			}
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			System.out.print(arr[i][j]+" ");					
	}

}
