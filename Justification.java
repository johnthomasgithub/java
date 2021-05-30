package logical;
import java.util.*;
public class Justification {
	public static String leftJustify(String[] words ,int diff, int i,int j) {
		int spacesOnRight = diff - (j - i - 1);
		StringBuilder  result= new StringBuilder(words[i]);
		for(int k = i+1; k<j; ++k)
		{
			result.append(" "+words[k]);
		}
		result.append(" ".repeat(spacesOnRight));
		return result.toString();
	}
	public static String middleJustify(String[] words,int diff,int i,int j) {
		int spacesNeeded = j-i-1;
		int spaces = diff / spacesNeeded;
		int extraSpaces = diff % spacesNeeded;
		StringBuilder result = new StringBuilder(words[i]);
		for(int k = i+1;k<j;++k) {
			int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
			result.append(" ".repeat(spacesToApply)+words[k]);
		}
		return result.toString();
	}
		 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		List<String> result = new ArrayList<>();
		String words[] = str.split(" ");
		int maxWidth = sc.nextInt();
		int i=0, n = str.length();
		while(i<n)
		{
			int j = i+1;
			int lineLength = words[i].length();
			while(j<n && (lineLength + words[j].length() + (j - i - 1) < maxWidth)) {
				lineLength += words[j].length();
				++j;
			}
			int diff = maxWidth - lineLength;
			int numberOfWords = j-i;
			if(numberOfWords == 1 || j>=n) 
				result.add(leftJustify(words,diff,i,j));
			else
				result.add(middleJustify(words,diff,i,j));
			i=j;
		}
		
		System.out.println(result);
	}

}
