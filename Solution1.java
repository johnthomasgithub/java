package logical;
import java.util.*;
public class Solution1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.next();
        findAnagramCount(s,s1);
}
public static void findAnagramCount(String s,String s1)
{
   int first[]=new int[26];
   int second[]=new int[26];
   for(int i=0;i<s.length();i++)
   {
       first[s.charAt(i)-'a']=first[s.charAt(i)-'a']+1;
   }
    for(int i=0;i<s1.length();i++)
       {
         second[s1.charAt(i)-'a']=second[s1.charAt(i)-'a']+1;
         }
         int res=0;
         for(int t=0;t<26;t++)
         {
             res+=Math.abs(first[t]-second[t]);
         }
         
         System.out.println(res);
}
}