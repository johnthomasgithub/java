package logical;
import java.util.*;
public class HeightCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int brr[] = arr.clone();
		Arrays.sort(brr);
		int match = 0;
		for(int i=0;i<n;i++)
			if(!(arr[i] == brr[i]))
				match++;
		System.out.println(match);
	}
}
