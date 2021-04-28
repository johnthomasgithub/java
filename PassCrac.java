package logical;
import java.util.*;
public class PassCrac {
    public static int finalSum;
	public static int digSum(int n,int input2)
	{
		int sum=0,rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
	
	
	public static int calSum(int input1,int input2) {
		if(input1==1)
		{
			for(int i=0;i<=9;i++)
			{
				if(i==input2)
					return i;
			}
		}
		else if(input1==2) {
			for(int i=10;i<=99;i++)
			{
				finalSum=digSum(i,input2);
				if(finalSum==input2)
					return i;
			}
		}
		else if(input1==3) {
			for(int i=100;i<=999;i++)
			{
				finalSum=digSum(i,input2);
				if(finalSum==input2)
					return i;
			}
		}
		else if(input1==4) {
			for(int i=1000;i<=9999;i++)
			{
				finalSum=digSum(i,input2);
				if(finalSum==input2)
					return i;
			}
		}
		else if(input1==5) {
			for(int i=10000;i<=99999;i++)
			{
				finalSum=digSum(i,input2);
				if(finalSum==input2)
					return i;
			}
		}
		
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int input1=sc.nextInt();
       int input2=sc.nextInt();
       
       int result=calSum(input1,input2);
       System.out.println(result);
       
	}

}
