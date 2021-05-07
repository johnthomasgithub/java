package logical;

class Node{
     int data;
     Node next;
}
class LinkList{
	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}else{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;	
		}
			
	}
	public void insertStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void insertAtPos(int data, int loc)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(loc == 0)
		{
			insertStart(data);
			
		}else
		{
			Node n = head;
		for(int i=0;i<loc-1;i++)
			n = n.next;
		node.next = n.next;
		n.next = node;
		}
	}
	public void deleteNode(int index)
	{
		if(index ==0)
		{
			head = head.next;
		}else {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
				n = n.next;
			n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
			
	}
	public void show()
	{
		Node n = head;
		while(n.next !=null)
		{
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
public class Linky {
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.insert(2333);
		list.insert(2);
		list.insert(212);
		list.insertAtPos(23, 0);
		list.deleteNode(2);

		list.show();
	}

}
  