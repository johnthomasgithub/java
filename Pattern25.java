package logical;
import java.util.*;
public class Pattern25 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				if(i<=3)
					System.out.print(i);
				else
					System.out.print(6-i);
			}
			System.out.println();
		}
	}

}
