package logical;
import java.util.*;
public class NextAlpha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer s = new StringBuffer(str);
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(Character.isDigit(ch))
			{
				char c = (char)((s.charAt(i-1))+(Integer.parseInt(ch+"")));
				s.setCharAt(i, c);
			}
		}
		System.out.print(s);
	}
}
