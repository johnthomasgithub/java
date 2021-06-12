package logical;
import java.util.*;
public class MoniFact {
	public static int fact(int n)
	{
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++)
		{
			int n = Integer.parseInt(str.charAt(i)+"");
			System.out.println(fact(n));
		}
	}

}
