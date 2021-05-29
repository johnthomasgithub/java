package logical;
import java.util.*;
public class CharLen {

	public static void main(String[] args) {
		char chars[] = {'a','a','a','b','b','c','w','e'};
		
		 StringBuilder s = new StringBuilder();

	        for (int i = 0; i < chars.length; i++) {
	            int j = i + 1;
	            while (j < chars.length && chars[i] == chars[j])
	                j++;
	            s.append(chars[i]);
	            if (j - i > 1)
	                s.append(j - i);
	            i = j - 1;
	        }
		System.out.println(s);
	}
}
