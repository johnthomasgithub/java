package logical;

class MNode{
	int data;
	MNode next;
}
class ML{
	public MNode getNewNode(int data)
	{
		MNode n = new MNode();
		n.data = data;
		n.next = null;
		return n;
	}
	public MNode insert(MNode head,int data)
	{
		if(head == null)
			return getNewNode(data);
		else
		head.next = insert(head.next,data);
		return head;
	}
	public void show(MNode head)
	{
		if(head ==null)
			return;
		else
			System.out.println(head.data);
		show(head.next);
	}
	public MNode getMiddle(MNode head)
	{
		if(head ==null)
			return null;
		MNode a = head;
		MNode b = head.next;
		while(b!=null && b.next!=null) {
			a = a.next;
			b = b.next.next;
		}
		return a;
	}
	
}
public class Middle {

	public static void main(String[] args) {
		MNode head = null;
		ML list = new ML();
		head = list.insert(head,1);
		head = list.insert(head,2);
		head = list.insert(head,3);
		head = list.insert(head,4);
		head = list.insert(head,5);
		head = list.insert(head,6);
		list.show(head);
		head = list.sort(head);


	}

}
