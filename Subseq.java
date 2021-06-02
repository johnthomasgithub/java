package logical;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Subseq {
	static long[][]  memo;
	static long count(int i,long coin[],int j){
		if(i==0)
			return 1;
		if(i<0)
			return 0;
		if(j<=0) 
			return 0;
		if(memo[i][j]!=-1) 
			return memo[i][j];
		memo[i][j]=count(i,coin,j-1)+count(i-(int)coin[j-1],coin,j);  
		//memo[i][j]=memo[i][j-1]+memo[i-value(c[j-1])][j] 
		//where  0<=j<=m hence j-1 is used.
		//for example if c[]=1,2,3 and n=4 then 
		//memo[4][3]=memo[4][2]+memo[4- value(c[2]])][3]
		//i.e. memo[4][3]=memo[4][2]+memo[1][3]
		return memo[i][j];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long c[]=new long[m];
		
		memo=new long[n+1][m+1];
		
		for(int i=0;i<=n;i++)
			for(int j=0;j<=m;j++) 
				memo[i][j]=-1;
		for(int c_i=0; c_i < m; c_i++){
			c[c_i] = in.nextLong();
		}
		long ways=count(n,c,m);
		// Print the number of ways of making change for 'n' 
		//units using coins having the values given by 'c'
		System.out.println(ways);
	}
}