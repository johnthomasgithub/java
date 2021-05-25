package logical;

import java.util.*;
public class Hashes {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("sv");
		ls.add("aaa");
		hs.add("john");
		hs.add("thomas");
		hs.add("tim");
		hs.addAll(ls);
		System.out.print(hs);
	}

}
