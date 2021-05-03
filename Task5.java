package logical;
import java.util.*;
public class Task5 {
    public static void findBitDif(List<Integer> li)
    {
    	int one = 0;
    	int zero = 0;
    	for(int i=0;i<li.size();i++)
    	{
    		int number = li.get(i);
    		String str = Integer.toBinaryString(number);
    		if(str.length()==1)
    		System.out.println(str);
    		else
    		{
    			 one = 0;
    			 zero = 0;
    			for(int j=0;j<str.length();j++)
    			{
    				if(Integer.parseInt(str.charAt(j)+"") ==1)
    					one++;
    				else
    					zero++;
    			}
    			System.out.println(Math.abs(one-zero));
    		}
    		
    	}
    }
	public static List<Integer> findDuplicates(int[] input)
	{
	  List<Integer> resultList = new ArrayList<Integer>();
	  Arrays.sort(input);
	  int count = 1;
	  int val = 0;
	  for(int num : input)
	  {
		  if(val ==num)
		  count++;
		  else
		  {
			  val = num;
			  count = 1;
		  }
		  if(count >=2)
		  {
			  resultList.add(num);
		  }
	  }
	  return resultList;
	}
	public static void main(String[] args) {
       int arr[] = {1,2,3,4,3,2,1};
       //System.out.println(findDuplicates(arr));
       List<Integer> result = findDuplicates(arr);
       System.out.println(result);
       findBitDif(result);
	}

}
