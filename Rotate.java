package logical;

import java.util.*;

public class Rotate {
	public static void rotateArray(int a[][],boolean val,int n,int m) {
		int i;
		int j;
		if(val) {
			for(i=0;i<m;i++) {
				for(j=n-1;j>=0;j--) {
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
		}
		else {
			for(i=m-1;i>=0;i--) {
				for(j=0;j<n;j++) {
					System.out.print(a[j][i]+" ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int arr[][]=new int [n][m];
		int i;
		int j;
		for(i=0;i<n;i++)
			for(j=0;j<m;j++)
				arr[i][j]=input.nextInt();
		boolean val=input.nextBoolean();
		rotateArray(arr,val,n,m);
	}

}