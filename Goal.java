package logical;
import java.util.*;

public class Goal {

	public static void main(String[] args) {
		String str="G()()()(al)";
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
				else if(str.charAt(i) =='(' && str.charAt(i+1) ==')') {
					System.out.print("o");
				}
			}
		}

	}
