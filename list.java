package logical;
import java.util.Scanner;
import java.io.*;
public class list {
public static void calc(long count,String rev){
	int s1=0,s2=0;
	if(count%2==0){
		for(int i=0;i<rev.length();i++){
			if(i%2==0)
			{
				s1+=Integer.parseInt(rev.charAt(i)+"");
				//System.out.println("iam in"+" "+s1 );
			}
			else if(i%2!=0)
				s2+=Integer.parseInt(rev.charAt(i)+"");
		}
	   System.out.println(s1*s2);
     }
	else if(count%2!=0){
		for(int i=0;i<rev.length();i++){
			if(i%2==0)
				s1-=(int)rev.charAt(i);
			else if(i%2!=0)
				s2-=(int)rev.charAt(i);
			
		}
	System.out.println(Math.abs(s1)*Math.abs(s2));
}
}
	public static long[] sumPal(int input1) {
	   String num = Long.toString(input1);
		String rev = new StringBuffer(num).reverse().toString();
		long sum = input1;
		long count = 0;
		if(num.equals(rev)) {
			return new long[] {-1 , input1};
		}
		
		while(count <=20)
		{
			if(Long.toString(sum).equals(rev))
			{
				return new long[] {count,Long.parseLong(rev)};
			}
			count++;
			sum +=Long.parseLong(rev);
			rev = new StringBuffer(Long.toString(sum)).reverse().toString();
		}
		calc(count,rev);
		return new long[] {-1 , input1};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long[] output = sumPal(1598);
		//System.out.println(output[0]+ " " + output[1]);
		calc(2,"1111");
	}
}