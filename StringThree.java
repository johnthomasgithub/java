package logical;
import java.util.*;
public class StringThree {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuffer sBuffer = new StringBuffer(str).reverse();
      String chBuffer  ="";
      for(int i=0;i<str.length();i++)
      {
    	  char ch = str.charAt(i);
    	  if(ch ==' ') {
    		   chBuffer = sBuffer.charAt(i)+"";
    		  System.out.print(chBuffer+""+" ");
    	  }else
    		  System.out.print(chBuffer);
      }
	}
}
