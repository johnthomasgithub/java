package logical;
import java.util.*;
class ANode{
	ANode()
	{}
	ANode(int data){this.data = data;}
	ANode next;
	int data;
}

class Rlink{
	public ANode getNewNode(int data)
	{
		ANode node = new ANode();
		node.data = data;
		node.next = null;
		return node;
	}
	
	public  ANode insert(int data,ANode head)
	{
		if(head == null)
			return getNewNode(data);
		else
		{
			head.next = insert(data , head.next);
		}
		return head;
	}
	public void show(ANode head)
	{
		if(head == null)
			return;
		else
			while(head!=null)
			{
				System.out.println(head.data);
				head = head.next;
			}
	}
	public ANode reverse(ANode head)
	{
		ANode temp = null;
		while(head != null)
		{
			ANode nexta= head.next;
			head.next = temp;
			temp = head;
			head = nexta;
		}
		return temp;
	}
	public ANode sort(ANode head)
	{
		if(head ==null || head.next == null)
		{
			return head;
		}
		ANode slow  = head;
		ANode fast = head;
		ANode tail = head;
		while(fast.next != null && fast.next.next !=null)
		{
			tail = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		tail.next = null;
		
		ANode left = sort(head);
		ANode right = sort(slow);
		return merge(left , right);
	}
	public ANode merge(ANode left,ANode right)
	{
		ANode merged = new ANode(0);
		ANode current = merged;
		while(left !=null && right!= null)
		{
			if(left.data <right.data)
			{
				current.next = left;
				left = left.next;
			}else {
				current.next = right;
				right = right.next;
			}
			current = current.next;
		}
		if(left != null)
		{
			current.next = left;
		} else {
			current.next = right;
		}
		return merged.next;
	}
}
public class ReverseList {

	public static void main(String[] args) {
		ANode head = null;
		Rlink list =new Rlink(); 
		head = list.insert(10,head);
		head = list.insert(20,head);
		head = list.insert(30,head);
		head = list.insert(40,head);
		head = list.insert(50,head);
		//list.show(head);
		//head = list.reverse(head);
		head = list.sort(head);
		list.show(head);
	}

}
