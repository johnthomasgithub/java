package logical;
import java.util.*;
public class NonFib {
    public static List<Integer> li = new ArrayList<Integer>();

	public static void calDif(int a,int b) {
		
		if((b-a)>0)
		{
			for(int i=a+1;i<b;i++)
			{
			int res=i;
			li.add(res);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;		
        int n=12;
        int input1=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			calDif(a,b);
			c=a+b;
			
			//System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println(li.get(input1-1));
	}

}
