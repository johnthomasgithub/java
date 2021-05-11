package logical;
import java.util.*;
public class Stringlen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.next();
		}
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i].length()< min) {
				min = arr[i].length();
				index = i;
			}
		}
		System.out.println(min + arr[index]);
	}
}
