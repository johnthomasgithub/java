package logical;

public class Lucral {

	public static long[] getSumPalindrome(int input1)
	{
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
		return new long[] {-1,input1};	
	}
	public static int sumOddEven(int n)
	{
		int odd = 0,even=0;
		
		if((n+"").length()==2)
			return Integer.parseInt((n+"").charAt(0)+"")*Integer.parseInt((n+"").charAt(1)+"");
		else
		{
			String a = n+"";
			for(int i=0;i<a.length();i++)
			{
				int cal = Integer.parseInt(a.charAt(i)+"");
				if(i%2==0)
					even+=cal;
				else
					odd+=cal;
			}
		}
//		System.out.println(even+ " "+ odd);
		return even*odd;
	}
	public static int diffOddEven(int n)
	{
        String odd = "",even="";
        int evenAns = 0,oddAns = 0;
		if((n+"").length()==2)
			return Integer.parseInt((n+"").charAt(0)+"")*Integer.parseInt((n+"").charAt(1)+"");
		else
		{
			String a = n+"";
			int temp = 0;
			for(int i=0;i<a.length();i++)
			{
				int cal = Integer.parseInt(a.charAt(i)+"");
				if(i%2==0)
					even+=cal;
				else
					odd+=cal;
			}
		}
		evenAns = Integer.parseInt(even.charAt(0)+"");
		oddAns = Integer.parseInt(odd.charAt(0)+"");
		for(int i=1;i<even.length();i++)
		{
			evenAns -= Integer.parseInt(even.charAt(i)+"");
		}
		for(int i=1;i<odd.length();i++)
		{
			oddAns -= Integer.parseInt(odd.charAt(i)+"");
		}
//		System.out.println(evenAns+ " "+ oddAns);
		return Math.abs(evenAns)*Math.abs(oddAns);
	}
	public static int findResult(long output[])
	{
		int count = (int)output[0];
		int number = (int)output[1];
		int result = 0;
		if(number >=0 && number<10) {
			return number;
		}
		else
		{
			if(count%2==0)
			
				result = sumOddEven(number);
			else
			{
				result = diffOddEven(number);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		long[] output = getSumPalindrome(1598);
		//System.out.println(output[0]+ " " + output[1]);
		int res = findResult(output);
		System.out.println(res);
	}

}
