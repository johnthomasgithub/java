package logical;
import java.util.*;
public class SecondNonRep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k=0;
		int count = 0;
		for(int i=0;i<str.length()-1;i++)
		{
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			  k++;
			if(k==2)
			{
				System.out.print(ch);
				i=999;
			}
		}

	}
}
