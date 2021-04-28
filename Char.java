package logical;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Char
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
		    int n=sc.nextInt();
		    int count=0;
		    String s=sc.next();
		    char ch[]=s.toCharArray();
		    
		    for(int i=0;i<n-1;i++)
		    {
		        //if(ch[i]!='a'|| ch[i]!='e'|| ch[i]!='i'|| ch[i]!='o'||ch[i]!='u')
		        //{
		             if(ch[i+1]=='a'|| ch[i+1]=='e'|| ch[i+1]=='i'|| ch[i+1]=='o'||ch[i+1]=='u')
		             count++;
		        //}
		    }
		    System.out.println(count);
		}
	}
}
