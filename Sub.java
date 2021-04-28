package logical;
import java.util.*;
public class Sub {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    //System.out.print(str);
    List<Character> li=new ArrayList<Character>();
    for(int i=0;i<str.length();i++)
    {
    	if(!(li.contains(str.charAt(i))))
    	{
    		li.add(str.charAt(i));
    	}
    	else
    		break;
    		
    }
    System.out.println(li.size());
	}

}
