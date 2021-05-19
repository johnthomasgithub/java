package logical;

public class Pattern23 {

	public static void main(String[] args) {
		int m = 1;
		for(int i=1;i<=5;i+=2)
		{
			for(int j=5;j>=1;j--)
			{
				if(j>i) System.out.print(" ");
				else System.out.print(m+++" ");
			}
			System.out.println();		
		}
	}
}
//
//    1 
//  2 3 4 
//5 6 7 8 9 
