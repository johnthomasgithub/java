package logical;
import java.util.*;
public class lexi {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String str=sc.next();
     HashSet<Character> hs = new HashSet<Character>();
     for(int i=0;i<str.length()-1;i++)
     {
    	char temp=str.charAt(i);
    	for(int j=i+1;j<str.length();j++)
    	{
    		if(temp==str.charAt(j))
    			hs.add(temp);
    	}
     }
     List<Character> list = new ArrayList<Character>(hs);
     Collections.sort(list);
    
    	 System.out.println(list.get(0));
	}

}
