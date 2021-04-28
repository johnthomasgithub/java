package logical;
import java.util.*;
public class LIve {
    public static int cumSum(int n)
    {
    	int sum = 0;
        if(n==0)
        	return 0;
        else if(n>0 && n<10)
        	return n;
        else if(n>9) {
        	 while (n > 0 || sum > 9)
             {
                 if (n == 0) {
                     n = sum;
                     sum = 0;
                 }
                 sum += n % 10;
                 n /= 10;
             }
        } 	
       	return sum;
    }
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		String str = "live let live";
		StringBuffer str1 = new StringBuffer(str);
		ArrayList<Character> li = new ArrayList<Character>();
		li.add('a');
		li.add('e');
		li.add('i');
		li.add('o');
		li.add('u');
		li.add('A');
		li.add('E');
		li.add('I');
		li.add('O');
		li.add('U');
		int sum = 0;
		boolean flag = false;
		for(int i=0;i<str1.length();i++)
		{
			
			if(str.length()==0)
			{
				flag = true;
				break;
			}
			char ch = str1.charAt(i);
			if(li.contains(ch))
			{
				String val = ch+"";
				sum = i+  ((val.toLowerCase().charAt(0))-96);
				int ans = cumSum(sum);
				
				str1.setCharAt(i, (char)(ans+'0'));
			}
			sum = 0;
				
			
		}
		
		System.out.print(str1);

	}

}
