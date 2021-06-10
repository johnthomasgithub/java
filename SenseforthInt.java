package logical;
import java.util.*;
public class SenseforthInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			String s = arr[i];
			if(s.length()%2==0)			
			{
				if(s.length()>max) {
				max = s.length();
				System.out.println(s+ " "+ s.length());
				}
			}
			
		}
	}
}
