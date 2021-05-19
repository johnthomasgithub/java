package logical;
import java.util.*;
public class LongSuffix {
public static String Long(String[] strs)
{
	String a= new StringBuffer(strs[0]).reverse()+"";
	for(int i=1;i<strs.length;i++)
	{
		a = helper(a, new StringBuffer(strs[i]).reverse()+"", "");
		if(a == "")
			return "";
	}
	return a;
}
public static String helper(String s1,String s2,String ans) {
	if(s1.length() == 0 || s2.length() == 0 || s1.charAt(0) != s2.charAt(0))
		return ans;
	if(s1.charAt(0) == s2.charAt(0)) {
		ans = ans+ s1.charAt(0);
	}
	return helper(s1.substring(1),s2.substring(1),ans);
}
	public static void main(String[] args) {
		System.out.println(Long(new String[] {"qher","wher","eeher"}));
	}

}
