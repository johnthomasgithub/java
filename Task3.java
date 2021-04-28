package logical;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer str = new StringBuffer(s);
		int key = sc.nextInt();
		int sum =0,mod =0;
		String even ="",odd = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			sum += key+ (ch-64);
			if(sum>26)
			{
				mod = sum%26;
				str.setCharAt(i,(mod+"").charAt(0));
			}else
			{
				str.setCharAt(i, (char)(sum+64));
			}
			sum = 0;
			mod = 0;
		}
		//System.out.println(str);
		str = str.reverse();
		for(int i=0;i<str.length();i++)
			if(i%2==0)
				even+=str.charAt(i);
			else
				odd += str.charAt(i);
		//System.out.println(even+ " "+ odd);
		if(key%2==0)
		   System.out.println(even+odd);
		else
			System.out.println(odd+even);
	
	}
}
