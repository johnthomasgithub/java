package logical;
import java.util.*;
public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j=0;
		System.out.println(0);
		for(int i=9;i>=1;i--)
		{
			for(j=i;j<=9;j++)
			{
				System.out.print(j);
			}
			System.out.print("0");
			for(j=9;j>=i;j--)
				System.out.print(j);
			System.out.println();
		}
	}
}


//0
//909
//89098
//7890987
//678909876
//56789098765
//4567890987654
//345678909876543
//23456789098765432
//1234567890987654321