package logical;
import java.util.*;
public class DualString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char strarr[] = str.toCharArray();
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		for(char c : strarr) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		int dualCount = 0;
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() >= 2)
				dualCount++;
		}
		if(dualCount >= 2)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
