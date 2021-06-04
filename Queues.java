package logical;
import java.util.*;
class queuess{
	int size = 5;
	int items[] = new int[size];
	int front = -1;
	int rear = -1;
	boolean isFull() {
		if(front == 0 && rear ==size-1) {
			return true;
		}
		return false;
	}
	boolean isEmpty() {
		if(front == -1)
			return true;
		else
			return false;
	}
	void enqueue(int data)
	{
		if(front == -1)
			front = 0;
		rear++;
		items[rear] = data;
	}
	int deQueue() {
		if(isEmpty()) {
			System.out.print("Queue is empty");
		return (-1);
		}else
		{
			
			int data = items[front];
			
			if(front >=rear)
			{
				front = -1;
				rear = -1;
			}else {
				front ++;
			}
			return (data);				
		}
	}
	void display() {
		for(int i=front;i<=rear;i++)
		{
			System.out.print(items[i]+" ");
		}
		System.out.println();
	}
}

public class Queues {

	public static void main(String[] args) {
		queuess q = new queuess();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.deQueue());
		q.display();

	}

}
