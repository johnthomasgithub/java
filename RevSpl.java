package logical;

public class RevSpl {

	public static void main(String[] args) {
		String str = "ab-cd";
		char arr[] = str.toCharArray();
		int r = str.length()-1;
		int l = 0;
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l]))
				l++;
			else if(!Character.isAlphabetic(arr[r]))
				r--;
			else
			{
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		String ans = String.valueOf(arr);
		System.out.println(ans);
	}

}

//
//class Solution {
//    public String reverseOnlyLetters(String S) {
//        int i = 0 , j = S.length()-1;
//        StringBuilder sb = new StringBuilder(S);
//        
//        while(i <= j)
//        {
//            boolean f1 = Character.isLetter(sb.charAt(i));
//            boolean f2 = Character.isLetter(sb.charAt(j));
//            
//            if(f1 && f2)
//            {
//                char c = sb.charAt(i);
//                sb.setCharAt(i,sb.charAt(j));
//                sb.setCharAt(j,c);
//                i++;
//                j--;
//            }
//            if(!f1) i++;
//            if(!f2) j--;
//        }
//        
//        return sb.toString();
//    }
//}
