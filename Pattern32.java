package logical;

public class Pattern32 {
	public static void main(String args[]) {
		int m = 1;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=5;j>=1;j--)
			{
				if(i<j)
					System.out.print(" ");
				else
					System.out.print(" "+m++);
			}
			System.out.println();
		}
	}
}
