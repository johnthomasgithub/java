package logical;
	
class SNode{
		int data;
		SNode next;
	}
	class LinkedList{
		
		public void printList(SNode head)
		{
			if(head == null) {
				return;
			}
			System.out.println(head.data);
			printList(head.next);
		}
		private SNode getNewNode(int data)
		{
			SNode n = new SNode();
			n.data = data;
			n.next = null;
			return n;
		}
		
		public SNode insert(int data,SNode head)
		{
			if(head == null)
			{
				return getNewNode(data);
			}else
			{
				head.next = insert(data,head.next);
			}
			return head;
		}
		public SNode insertFront(int data,SNode head)
		{
			SNode n = getNewNode(data);
			n.next = head;
			return n;
		}
		
	}
	
	public class Link {
		
	public static void main(String[] args) {
		SNode head = null;
		LinkedList list = new LinkedList();
		head = list.insertFront(100, head);
		head = list.insert(2, head);
		head = list.insert(5, head);
		head = list.insert(53, head);
		head = list.insertFront(1, head);
		list.printList(head);

		

	}
}
