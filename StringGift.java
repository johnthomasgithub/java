package logical;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StringGift {
	
	public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm)
    {
        
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        Collections.reverse(list);
         
        
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
	
	public static void checkChar(String arr[],int i) {
		int j;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(j=0;j<arr.length;j++) {
			char ch = arr[j].charAt(i);
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		map = sortByValue(map); 
		int count=0;
		char max='a';
		int maxv=-999;
		boolean flaf=false;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			int val = entry.getValue();
			char temp=entry.getKey();
			
			if(count>0) {
				if(val==maxv) {
					if(temp<max) {
						max=temp;
						maxv=val;
				}
				}
				else {
					flaf=true;
					break;
				}
			}
			else {
				max=temp;
				maxv=val;
			}
			count++;
			if(flaf)
				break;
		}
		System.out.print(max);
		
		
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		int n=input.nextInt();
		
		int i;
		String arr[]=new String [testCase];
		for(i=0;i<testCase;i++)
			arr[i]=input.next();
		for(i=0;i<n;i++) {
			checkChar(arr,i);
		}

	}

}