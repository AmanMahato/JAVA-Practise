public class LinkedList{
	public static void main(String[] args){
		LinkedList obj=new LinkedList();
		Node head=null;
		head=obj.insertAtFirst(head,100);
		head=obj.insertAtFirst(head,120);
		head=obj.insertAtFirst(head,130);
		head=obj.insertAtFirst(head,140);
		head=obj.insertAtLast(head,999);
		head=obj.insertAtLast(head,1020);
		head=obj.insertAtLast(head,1830);
		head=obj.insertAtLast(head,1540);
		obj.display(head);
		System.out.println("Upto Here the Original List");
		head=obj.delete(head,140);
		System.out.println("Deliting 140 from the original list");
		obj.display(head);
		System.out.println("REVERSED LIST");
		Node temp=obj.reverse(head);
		obj.display(temp);
		Node tem=obj.reverse(temp);//to get back the original list
		System.out.println("Size of the list: "+obj.sizeOfList(head));
		System.out.println("123 is there: "+obj.isPresent(head,123));
		System.out.println("120 is there: "+obj.isPresent(head,120));
		head=obj.insertAtLast(head,999);
		head=obj.insertAtLast(head,1020);
		System.out.println("Size of the list: "+obj.sizeOfList(head));
		Node setLikeList=obj.deleteDuplicate(head);
		System.out.println("Removing Duplicate Items from the list");
		obj.display(setLikeList);
	}
	public Node deleteDuplicate(Node head){
		Node copiedlist=Node.copyNode(head);
		Node temp=head;
		while(copiedlist!=null){
			while(head!=null){
				if(copiedlist.data==head.data){
					head=delete(temp,head.data);
					head=head.next;
				}
				copiedlist=copiedlist.next;
			}
		}
		return temp;
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
	public int sizeOfList(Node head){
		int count=0;
		if(head==null) return  count;
		while(head.next!=null){
			count++;
			head=head.next;;
		}
		return count+1;
	}
	public Node reverse(Node head){ //inplace reverse
		if (head==null || head.next==null) return head;
		Node reversedList=reverse(head.next);
		head.next.next=head;
		head.next=null;
		return reversedList;
	}
	public Boolean isPresent(Node head, int data){
		if (head==null) return false;
		while(head!=null){
			if(head.data==data) return true;
			head=head.next;
		}
		return false;
	}
}
class Node{
	int data;
	Node next;
	public static Node copyNode(Node node){
		return(node==null ? null : new Node(node));
	}
	public Node(Node node){
		
	}
	public Node(int data){
		this.data=data;
		next=null;
	}
	public static Node newNode(int data){
		return new Node(data);
	}
}