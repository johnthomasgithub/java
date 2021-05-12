package logical;
import java.util.*;

class DNode{
	int data;
	DNode next;
}

class LL{
	public DNode getNewNode(int data)
	{
		DNode n = new DNode();
		n.data = data;
		n.next = null;
		return n;
	}
	
	public DNode insert(int data,DNode head)
	{
		if(head == null)
			return getNewNode(data);
		else
			head.next = insert(data,head.next);
		return head;
	}
	public void show(DNode head)
	{
		if(head == null)
			return;
			System.out.print(head.data+" ");
			show(head.next);
	}
	public DNode deleteAtData(DNode head,int val)
	{
		if(head == null)
         return head;
		else
		{
			DNode temp = head;
			while(temp.next.data!=val)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
			return head;
		}
	}
	
	public void convertString(DNode head)
	{
		if(head ==null)
			return;
		else
		{
			String str = "";
			while(head !=null)
			{
				str+=head.data+"";
				head = head.next; 
			}
			int decimal=Integer.parseInt(str,2);
			System.out.println(decimal);
		}
	}
	public DNode reverse(DNode head) {
		if(head == null || head.next == null)
			return head;
		DNode temp = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}
}


public class DeleteNode {

	public static void main(String[] args) {
		DNode head = null;
		LL list = new LL();
		head = list.insert(1,head);
		head = list.insert(2,head);
		head = list.insert(7,head);
		head = list.insert(200,head);
		//head = list.insert(1,head);
		DNode reverse = list.reverse(head);
		list.show(reverse);
	}

}
