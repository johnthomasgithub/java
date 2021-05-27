package logical;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			li.add(sc.nextInt());
		int rotate = sc.nextInt();
		Collections.rotate(li, rotate);
		System.out.println(li);
	}

}
