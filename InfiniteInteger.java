package logical;
import java.util.*;
public class InfiniteInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int len = 1,st = 1;
//		long count = 9;
//		while(n >len * count) {
//			n -=len * count;
//			count *=10;
//			len++;
//			st *=10;
//		}
//		st +=(n-1)/len;
//		String num = String.valueOf(st);
//		System.out.println(Character.getNumericValue(num.charAt((n-1)%len)));
		StringBuffer ans = new StringBuffer();
		for(int i=1;i<=n;i++)
		{
			ans.append(i);
		}
		System.out.println(ans.charAt(n-1));

	}

}
