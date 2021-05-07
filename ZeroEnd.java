package logical;

import java.util.Scanner;

public class ZeroEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int k=0;
		for(int i=0;i<n;i++)
		{
			int temp = sc.nextInt();
			if(temp>0)
				arr[k++] = temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
