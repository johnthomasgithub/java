package logical;
import java.util.*;
public class StringRev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<Integer> index = new ArrayList<Integer>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
				index.add(i);
		}
		StringBuffer s = new StringBuffer(str).reverse();
		String res = "";
		int spIndex = 0;
		System.out.println(index);
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(i == index.get(spIndex))
				{
				res+=" "+ch+"";
				System.out.println(res);
				spIndex++;
				}
			else if(!(ch ==' '))
				res+=ch+"";
			
		}
		System.out.println(res);
	}

}
