package logical;
import java.util.*;
public class Lucy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int num = sc.nextInt();
			int pow = sc.nextInt();
			int mod = sc.nextInt();
			if(pow ==  -1)
				System.out.println(num % pow);
				else
				System.out.print((int)Math.pow(num, pow)%mod);
		}
	}
}
