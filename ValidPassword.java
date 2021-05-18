package logical;
import java.util.*;
public class ValidPassword {
	public static boolean isCap(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= 65 && ch <=90)
				return true;
		}
		return false;
	}
	public static boolean isSml(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= 97 && ch <=122)
				return true;
		}
		return false;
	}
	public static boolean isNum(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
				return true;
		}
		return false;
	}
	public static int checkValidPass(String str)
	{
		if(str.contains(" ") || str.contains("/") || Character.isDigit(str.charAt(0)) || str.length()<4)
		return 0;
		else
			if(isSml(str) && isCap(str) && isNum(str))
				return 1;
		return 0;
	}
	public static void main(String[] args) {
		String str = "joA6h_n";
		System.out.println(checkValidPass(str));
	}

}
