package logical;
import java.util.*;
import java.util.Arrays;

public class Ana {
 public static Boolean isAnagram(String s1,String s2) {
	 char[] a1 = s1.toCharArray();
	 char[] a2 = s2.toCharArray();
	 Arrays.sort(a1);
	 Arrays.sort(a2);
	 if(Arrays.equals(a1, a2))
	 return true;
	 else
		return  false;
 }
	public static void main(String[] args) {
		//String arr[] = {"123","213","321","456","654","223"};
		List<String> list = new ArrayList<String>();
		list.add("123");
		list.add("213");
		list.add("321");
		list.add("456");
		list.add("654");
		list.add("233");
		List<List<String>> listOfList = new ArrayList<List<String>>();
		List<String> single = new ArrayList<String>();
		while(list.size()!=0) {
			String str = list.get(0);
			for(int j=1;j<list.size();j++)
			{
				if(isAnagram(str,list.get(j)))
				{
					single.add(list.get(j));
					list.remove(j);
				}
			}
			single.add(list.get(0));
			list.remove(0);
			listOfList.add(single);
			single.clear();
		}
		System.out.println(listOfList);
	}
}
