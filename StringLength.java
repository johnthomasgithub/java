package logical;
import java.util.*;
public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "john is a frontend developer";
		String arr[] = str.split(" ");
		int max = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
