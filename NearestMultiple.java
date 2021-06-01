package logical;
import java.util.*;
public class NearestMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0) {
			int n = sc.nextInt();
			int power = sc.nextInt();
			int mul = sc.nextInt();
			if(power <0)
				System.out.println(0);
			else {
				double number = Math.pow(n, power);
				for(int i=(int)number;i>=mul;i--) {
					if(i % mul == 0) {
						System.out.println(i);
					    break;
					}
				}
			}
		}
	}
}
