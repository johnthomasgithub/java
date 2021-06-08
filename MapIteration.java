package logical;
 import java.util.*;
public class MapIteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,String> map= new HashMap<String,String>();
		map.put("name", "john");
		map.put("Age", "22");
		map.put("gender", "male");
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}

	}

}
