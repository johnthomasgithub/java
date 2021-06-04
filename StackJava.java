package logical;
import java.util.*;
class Stackss{
	static int top = -1;
	static int max = 10;
	static int arr[] = new int[max];
	
	boolean isEmpty() {
		return (top<0);
	}
	void push(int data)
	{
		if(top == max-1)
			System.out.println("Overflow");
		else
			arr[++top] = data;
	}
	void pop()
	{
		if(isEmpty())
			System.out.println("Underflow");
		else {
			System.out.println(arr[top]);
			top--;
		}
	}
	void display()
	{
		for(int i=top;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}

public class StackJava {

	public static void main(String[] args) {
		Stackss st = new Stackss();
		st.push(1);
		st.push(2);
		st.push(3);
		st.display();
		st.pop();
		st.display();
	}

}
