package logical;
import java.util.*;
public class FirstAndLast {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch = sc.next().charAt(0);
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == ch)
			{
				System.out.println("first: "+i);
				break;
			}
		}
		int index = 0;
		for(int i=0;i<name.length();i++)
			if(name.charAt(i) == ch)
				index = i;
		System.out.println("last: "+ index);
		
	}
}
