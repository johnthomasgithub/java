package logical;

public class QuickSort2 {
	
	static void quicksort(int number[],int first,int last){
		   int start, end, pivot, temp;

		   if(first<last){
		      pivot=first;
		      start=first;
		      end=last;

		      while(start<end){
		         while(number[start]<=number[pivot])
		            start++;
		         while(number[end]>number[pivot])
		            end--;
		         if(start<end){
		            temp=number[start];
		            number[start]=number[end];
		            number[end]=temp;
		         }
		      }

		      temp=number[pivot];
		      number[pivot]=number[end];
		      number[end]=temp;
		      quicksort(number,first,end-1);
		      quicksort(number,end+1,last);

		   }
		}
	
	public static void main(String[] args) {
		int arr[] = {1,4,2,6,7,8,3,50};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
