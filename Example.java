package logical;
import java.util.*;
public class Example {

	public static void main(String[] args){
		int x = 10;
		int y = 90;
		while(y!=0)
		{
			int carry = x&y;
			x = x^y;
			y = carry << 1;
		}
		System.out.println(x);
	}
}
