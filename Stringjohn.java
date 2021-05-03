package logical;

import java.util.*;

public class Stringjohn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer s = new StringBuffer(str).reverse();
		for(int i=0;i<s.length();i++)
		{
			char ch1 =str.charAt(i);
			char ch2 =(s.toString()).charAt(i);
			if(!(ch1 == ' ' )&& !(ch2 == ' '))
			System.out.print(ch2);
			else {
				 if(ch2 == ' ')
					 System.out.print((s.toString()).charAt(i+1));
				 else
					 System.out.print(" "+ch2);
			}
		}
		
	}
}
