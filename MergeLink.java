package logical;
import java.util.*;
 class ONode{
	 int data;
	 ONode next;
 }
 class MergeL{
	 public ONode getNewNode(int data)
	 {
		 ONode node = new ONode();
		 node.data = data;
		 node.next = null;
		 return node;
	 }
	 public  ONode insert(int data,ONode head)
	 {
		 if(head == null)
			 return getNewNode(data);
		 else
		 {
			 head.next = insert(data,head.next);
		 }
		 return head;
	 }
	 public void show(ONode head)
	 {
		 if(head == null)
			 return;
		 
			 System.out.println(head.data);
			 show(head.next);
	 }
	 public void merge(ONode head1,ONode head2)
	 {
		 ONode temp = head1;
		 while(temp.next!=null)
		 {
			 temp = temp.next;
		 }
		 temp.next = head2;
		 show(head1);
	 }
	 public ONode mergeTwoList(ONode l1,ONode l2)
	 {
		 if(l1 == null) return l1;
		 if(l2 == null) return l2;
		 if(l1.data > l2.data)
		 {
			 ONode temp = l1;
			 l1 = l2;
			 l2 = temp;
		 }
		 ONode res = l1;
		 while(l1!= null && l2!= null)
		 {
			 ONode tmp = null;
			 while(l1!= null && l1.data <= l2.data)
			 {
				 tmp = l1;
				 l1 = l1.next;
			 }
			 tmp.next = l2;
			 
			 ONode temp = l1;
			 l1 = l2;
			 l2 = temp;
		 }
		 return res;
	 }
 }

public class MergeLink {
 
	public static void main(String[] args) {
		ONode head = null;
		MergeL list = new MergeL();
		head = list.insert(1,head);
		head = list.insert(2,head);
		head = list.insert(3,head);
		head = list.insert(4,head);
		//list.show(head);
		ONode head2 = null;
		head2 = list.insert(10,head2);
		head2 = list.insert(20,head2);
		head2 = list.insert(30,head2);
		head2 = list.insert(40,head2);
		//list.show(head2);
		//list.merge(head,head2);
		ONode mergeSorted = list.mergeTwoList(head,head2);
		list.show(mergeSorted); 

	}

}
