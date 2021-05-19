package logical;
import java.util.*;
public class LongPrefix {
	public static String findPrefix(String[] strs)
	{
		if(strs.length ==0)
			return "";
		if(strs.length == 1)
			return strs[0];
		String a = strs[0];
		for(int i=0;i<a.length();i++)
		{
			for(int j=1;j<strs.length;j++)
			{
				if(i>=strs[j].length())
					return a.substring(0, i);
				else
					if(strs[j].charAt(i) != a.charAt(i))
						return a.substring(0,i);
			}
		}
	
		return a;
	}
	public static void main(String[] args) {
		String strs[] = {"john"};
		System.out.println(findPrefix(strs));
	}

}
