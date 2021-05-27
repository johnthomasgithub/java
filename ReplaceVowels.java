package logical;
import java.util.*;
public class ReplaceVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer str = new StringBuffer(s); 
		StringBuffer vowels = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				vowels.append(ch);
		}
		vowels.reverse();
		int k = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				str.setCharAt(i, vowels.charAt(k++));
		}
		System.out.print(str);
	}
}
