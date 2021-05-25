package logical;
import java.util.*;
public class hash {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		ArrayList<Integer> li = new ArrayList<Integer>(hs);
		Collections.sort(li);
		hs.addAll(li);
		System.out.println(hs);
		System.out.println(li);
	}
}
