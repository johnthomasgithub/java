package logical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeDiffTwo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	int n=sc.nextInt();
	int n1=sc.nextInt();
	List li=new ArrayList();
	for(int i=n;i<=n1;i++)
	{
		int count=0;
		for(int j=2;j<i;j++)
			if(i%j==0)
				count++;
		if(count==0)
			li.add(i);
	}
	System.out.println(li);
	int c=0;
	for(int i=0;i<li.size()-1;i++)
	{
		int h=(int)li.get(i+1)-(int)li.get(i);
		if(h==2)
			c++;
	}
	System.out.println(c);
}
}