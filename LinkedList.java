public class LinkedList{
	public static void main(String[] args){
		LinkedList obj=new LinkedList();
		Node head=null;
		head=obj.insertAtFirst(head,100);
		head=obj.insertAtFirst(head,120);
		head=obj.insertAtFirst(head,130);
		head=obj.insertAtFirst(head,140);
		System.out.println("Break");
		head=obj.insertAtLast(head,999);
		head=obj.insertAtLast(head,1020);
		head=obj.insertAtLast(head,1830);
		head=obj.insertAtLast(head,1540);
		obj.display(head);
		System.out.println("Hello");
		head=obj.delete(head,140);
		obj.display(head);
	}
	public Node insertAtFirst(Node head, int data){
		Node n=new Node(data);
		if(head==null) return n;
		n.next=head;
		head=n;
		return head;
	}
	public Node insertAtLast(Node head, int data){
		Node returnHead=head;
		Node n=new Node(data);
		if(head==null) return n;
		while(head.next!=null){
			head=head.next;
		}
		head.next=n;
		return returnHead;
	}
	public Node delete(Node head, int data){
		Node returnHead=head;
		if (head==null) System.out.println("Empty LinkedList");
		if (head.data==data && head.next==null) return null;
		if (head.data==data && head.next!=null) return returnHead=returnHead.next;
		while(head.next!=null){
			if(head.next.data==data){
				head.next=head.next.next;
				break;
			}
			head=head.next;
		}
		return returnHead;
	}
	public void display(Node head){
		if (head==null) {
			System.out.println("Empty LinkedList");
		}
		while(head != null){
			System.out.println(head.data);
			head=head.next;
		}
	}
}
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		next=null;
	}
	public static Node newNode(int data){
		return new Node(data);
	}
}