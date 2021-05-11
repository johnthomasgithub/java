package logical;
import java.util.*;
public class Abcd {
    public static void printAlpha(char ch,int times)
    {
    	for(int i=0;i<times;i++)
    		System.out.print(ch);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			printAlpha(str.charAt(i),Integer.parseInt(str.charAt(i+1)+""));
			i++;
		}
	}
}
