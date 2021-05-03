package logical;

import java.util.*; 


public class StringTwo {

	public static void rev(String rev)
	{
		char arr[] = rev.toCharArray();
		char result[] = new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == ' ')
				result[i] = ' ';
		}
		int j = result.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!= ' ')
			{
				if(result[j] == ' ')
					j--;
				result[j] = arr[i];
				j--;
			}
		}
		System.out.print(result);
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      rev(str);
	}

}
