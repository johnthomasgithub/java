package logical;
import java.util.*;
//public class Dot {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			if(!(ch =='.'))
//				System.out.print(ch);
//			else
//				System.out.print("[.]");
//		}
//	}
//}
public class Dot {

	public static void main(String[] args) {
		String str[] = "255.100.50.0".split("[.]");
		for(int i=0;i<str.length-1;i++)
			System.out.print(str[i]+"[.]");
			System.out.print(str[str.length-1]);
	}

}