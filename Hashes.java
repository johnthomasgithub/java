package logical;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashes {
	public static void main(String[] args)
	{

		String str = "Alice is girl and Bob is boy";
		Map<String, Integer> m = new HashMap<>();
		String[] s = str.split(" ");
		
		for (String word : s) {			
			if (m.containsKey(word))
				m.put(word, m.get(word) + 1);
			else
				m.put(word, 1);
		}
		Iterator<Map.Entry<String, Integer>> it = m.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey()+" =>"+ entry.getValue());
		}
	}
}