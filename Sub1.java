package logical;
import java.util.*;
public class Sub1 {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int i=0;
      int j=0;
      int max=0;
      HashSet<Character> set=new HashSet<Character>();
      while(j<s.length())
      {
    	  if(! set.contains(s.charAt(j)))
    	  {
    		  set.add(s.charAt(j));
    		  j++;
    		  max=Math.max(set.size(), max);
    	  }else {
    		  set.remove(s.charAt(i));
    		  i++;
    	  }
      	}
      System.out.println(max);
	}

}
