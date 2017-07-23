package linkedlist;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
		
		list.insertAtBegin(new ListNode(0));
		list.insertAtEnd(new ListNode(9));
		list.insert(1, 1);
		list.insertAtBegin(new ListNode(7));
		list.insertAtEnd(new ListNode(8));
		
		System.out.println(list.toString());
		
	}
	
}
