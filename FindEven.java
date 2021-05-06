package logical;
import java.util.*;
public class FindEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			int temp = sc.nextInt();
			if(temp>0)
				li.add(temp);
		}
		Collections.sort(li);
		if(li.get(0) != 1)
			System.out.println(1);
		else
		{
			for(int i=0;i<li.size()-1;i++)
				if(!(li.get(i)+1 == li.get(i+1)))
					System.out.print(li.get(i)+1);
		}
	}

}
