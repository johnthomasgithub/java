package logical;
import java.util.*;
public class StringZoho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long  sum = 0;
		while(n-->0)
			sum += sc.nextInt();
		System.out.println(sum);
	}

}
