package logical;
import java.util.*;
public class StringPalWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0;
        int j = str.length()-1;
        int flag = 0;
        while(i<j)
        {
        	if(str.charAt(i)!=str.charAt(j))
        	{
        		flag = 1;
        		break;
        	}
        	i++;
        	j--;
        }
        if(flag == 1)
        {
        	System.out.println("No");
        }else
        	System.out.println("Yes");
	}

}
