package logical;
import java.util.*;
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String arr[] = str.split("/");
		ArrayList<String> li = new ArrayList<String>();
		if(arr.length == 1 && arr[0].equals("."))
			System.out.println("/");
		else if(arr.length == 2 && arr[0].equals("") && arr[1].equals(".."))
		System.out.println("/");
		else if(arr.length == 1 && !arr[0].equals(".."))
			System.out.println("/"+arr[0]);
		else
		{
			
			for(int i=0;i<arr.length;i++)
			{
				String s = arr[i];
				if(s.equals(".."))
				{
					li.remove(li.size()-1);
				}
				else if(s.equals(".") || s.equals("")) 
				{
					continue;
				}
				else
					li.add(s);
			}
			if(li.size() == 0)
				System.out.println("/");
			else {
				for(int i=0;i<li.size();i++)
				{
					System.out.print("/"+li.get(i));
				}
		}
		
		}
		
	}
}
