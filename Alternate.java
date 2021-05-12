package logical;
import java.util.*;
public class Alternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int c = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
				System.out.print(" ");
			else
			{
				if(c%2 == 0)
				System.out.print((str.charAt(i)+"").toUpperCase());
				else
					System.out.print(str.charAt(i));
				c++;
			}
		}
	}
}
