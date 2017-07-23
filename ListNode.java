package linkedlist;

public class ListNode {
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode(int data) {
		this.data = data;
	}
	
	public ListNode next;

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
	ListNode reverse(ListNode node) {
		ListNode prev = null;
		ListNode current = node;
		ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
	
	
	
}
