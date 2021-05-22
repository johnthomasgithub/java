package logical;
import java.util.*;
public class StringDup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			set.add(sc.next());
		}
		System.out.println(set);
	}

}

//
//4
//john
//moni
//john
//moni
//OP => [john, moni]