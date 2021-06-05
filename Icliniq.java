package logical;
import java.util.*;
 class Queue1{
	 int size = 5;
	 int arr[] = new int[size];
	 int front = -1;
	 int rear = -1;
	 void insert(int data)
	 {
		 if(front == -1)
			 front = 0;
		 rear++;
		 arr[rear] = data;
		 System.out.println(arr[rear]+" inserted");
	 }
	 void display() {
		 if(front == -1)
		 System.out.println("Empty");
		 else
		 {
			 for(int i = front;i<=rear;i++)
			 {
				 System.out.print(arr[i]);
			 }
			 System.out.println();
		 }
	 }
	 void dequeue()
	 {
		 if(front>=rear || front == 1) {
			 front = rear = -1;
			 System.out.println("Empty");
		 }else
		 {
			 int data = arr[front];
			 System.out.println("deleted "+data );
		 }
	 }
}

public class Icliniq {

	public static void main(String[] args) {
		Queue1 q = new Queue1();
		q.insert(1);
		q.insert(2);
		q.display();
		q.dequeue();
		q.dequeue();
		
		
	}

}
