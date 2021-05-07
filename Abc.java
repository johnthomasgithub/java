package logical;
import java .util.*;

public class Abc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			int numbers  = sc.nextInt();
			String res = "";
			for(int i=0;i<numbers;i++)
			{
				int n = sc.nextInt();
				char ch = s.charAt(i);
				if((ch+n) > 122)
					res+=(char)((ch+n)-26);
				else
				res+= (char)(ch+n);
			}
			System.out.println(res);
		}
	}

}
