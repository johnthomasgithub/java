package logical;
class Node{
	int data;
	Node next;
}
class LinkList{
	
	public Node getNewNode(int data)
	{
		Node n = new Node();
		n.data = data;
		n.next = null;
		return n;
	}
	public Node insert(int data,Node node)
	{
		if(node == null)
			return getNewNode(data);
		else
		{
		node.next = insert(data,node.next);
		}
		return node;
	}
	public Node insertFirst(int data,Node head)
	{
		Node n = getNewNode(data);
		n.next = head;
		return n;	
	}
	public void printList(Node head)
	{
		if(head == null)
			return;
	    System.out.println(head.data);
	    printList(head.next);
	}
	public Node delete(Node node)
	{
		if(node == null || node.next ==null)
			return null;
		else
		{
			Node temp = node;
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}
			temp.next = null;
			return node;
		}
	}
	public Node deleteFirst(Node node)
	{
		if(node ==null)
		{
			return null;
		}
		return node.next;
	}	
	public Node insertAtPos(int data,int position,Node head)
	{
		if(position <1) {
			System.out.println("enter valid position");
			return head;
		}
		if(head ==null && position >1)
		{
			System.out.println("enter a valid position");
		}
		if(position == 1)
		{
			Node newNode = getNewNode(data);
			newNode.next = head;
			return newNode;
		}
		head.next = insertAtPos(data, position-1, head.next);
		return head;	
	}
}
public class LinkInsert {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		Node head = null;
		head = list.insert(12, head);
		head = list.insert(13, head);
		head = list.insert(14, head);
		head = list.insert(15, head);
		//head = list.delete(head);
		//head = list.deleteFirst(head);
		list.printList(head);
		head = list.insertAtPos(34,3,head);
		
		
	}

}
