package logical;
import java.util.Scanner;
import java.util.Stack;

public class ValidTag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//Stack<String> f=new Stack();
		Stack<String> l=new Stack();
		String sub="";
		String main="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='<'&&s.charAt(i+1)!='/')
			{
				int j=i;
				sub="";
				while(s.charAt(j)!='>')
				{
					sub+=s.charAt(j++);
				}
				sub+=">";
				main+=sub;
				sub=sub.substring(0,1)+"/"+sub.substring(1,sub.length());
				l.push(sub);
				i=j;
			}
			else if(s.charAt(i)=='<'&&s.charAt(i+1)=='/')
			{
				int j=i;
				sub="";
				while(s.charAt(j)!='>')
				{
					sub+=s.charAt(j);
					j++;
				}
				sub+=">";
				while(true)
				{
					String p=l.pop();
					if(sub.equals(p))
					{
						main+=sub;
						break;
					}
					else
					{
						main+=p;
					}
				}
				i=j;
			}
			else
				main+=s.charAt(i);
			
		}
		while(!l.isEmpty())
			main+=l.pop();
		System.out.println(main);
	}
}