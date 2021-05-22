package logical;
import java.util.*;
public class RevOnlyCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = str.split("-");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		String ans = String.valueOf(arr);
		StringBuffer s = new StringBuffer(ans).reverse();
		int k=0;
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '-')
			{
				//System.out.print("-"+s.charAt(k++)+"");
				res+=("-"+s.charAt(k++)+"");
			}else
			{
				//System.out.print(s.charAt(k++)+"");
				res+=s.charAt(k++);
			}
		}
		System.out.println(res);
		System.out.println(ans);
	}

}
