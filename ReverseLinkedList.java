package linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		list.insertAtBegin(new ListNode(6));
		list.insert(3, 1);
		list.insert(4, 2);
		list.insertAtEnd(new ListNode(5));
		list.insertAtBegin(new ListNode(6));
		
		list.printList(list.getNode());
		
		System.out.println("");
		
		list.printList(list.reverse(list.getNode()));
		
	}

}
