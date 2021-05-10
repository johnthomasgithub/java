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
		public SNode insertAtPosition(int data,int position,SNode head)
		{
			if(position <1)
			{
				System.out.println("Enter valid position");
				return head;
			}
			if(head == null && position >1)
			{
				System.out.println("position is greated than the size");
				return head;
			}
			if(head == null && position == 1)
			{
				return getNewNode(data);
			}
			if(position ==1)
			{
				 SNode newNode = getNewNode(data);
				 newNode.next = head;
				 return newNode;
			}
			head.next = insertAtPosition(data, position-1, head.next);
			return head;
		}
		public SNode delete(SNode node)
		{
			if(node == null || node.next == null)
				return null;
			SNode temp = node;
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}
			temp.next = null;
			return node;
		}
		public SNode deleteFirst(SNode node)
		{
			if(node == null)
				return null;
			return node.next;
		}
		public SNode deleteAtPosition(SNode node,int position)
		{
			if(position <0) {
				System.out.println("Not a valid position");
				return node;
			}
			if(node ==null && position > 1)
			{
				System.out.println("Not a valid position");
			}
			if(position == 1)
				return node.next;
			node.next = deleteAtPosition(node.next, position-1);
			return node;		
		}
		public int getSize(SNode node)
		{
			int count=0;
			if(node ==null)
			{
				return 0;
			}
			else
			{
				while(node!=null)
				{
					count++;
					node = node.next;
				}
				return count;
			}
		}
		public boolean search(int val,SNode node)
		{
			if(node == null)
				return false;
		while(node !=null)
		{
			if(node.data ==val)
				return true;
			node = node.next;
		}
		return false;
	}
	}
		
	public class Link {
		
	public static void main(String[] args) {
		SNode head = null;
		LinkedList list = new LinkedList();
		head = list.insert(12, head);
		head = list.insert(232, head);
		head = list.insert(123, head);
		head = list.insert(145, head);
		System.out.println(list.getSize(head));
		System.out.println(list.search(1,head));
		list.printList(head);
	}
}
