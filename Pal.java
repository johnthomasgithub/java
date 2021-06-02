package logical;
import java.util.*;
public class Pal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		int j=0;
		int count = 0;
		for(int i=ch.length-1;i>=0;i--)
		{
			char cha = str.charAt(j++);
			if(cha == ch[i])
				count++;
		}
		if(ch.length ==count)
			System.out.print("Paldindrome");
		else
			System.out.print("No");
	}
}
