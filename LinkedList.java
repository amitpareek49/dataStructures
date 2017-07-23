package linkedlist;

public class LinkedList {
	private int length;
	
	ListNode head;
	
	public LinkedList() {
		length= 0;
	}
	
	public ListNode getNode(){
		return head;
	}

	public void insertAtBegin(ListNode node){
		node.setNext(head);
		head = node;
		length++;
	}
	
	public int getLength(ListNode head){
		int length =0;
		ListNode currentNode = head;
		if(currentNode != null){
			length++;
			currentNode = head.getNext();
		}
		return length;
	} 
	
	public void insertAtEnd(ListNode node){
		if(head == null){
			head = node;
		} else {
			ListNode p = head;
			/*for (p= head; (q = p.getNext()) != null; p = q);*/
			while(p.getNext() != null)
				p= p.getNext();
				p.setNext(node);
			
			length ++ ;
		}
	}
	
	public void insert(int data, int position){
		
		if(position < 0){
			position = 0;
		}
		if(position > length){
			position = length;
		}
		
		if(head == null){
			head = new ListNode(data);
		}
		
		else if(position == 0){
			ListNode temp = new ListNode(data);
			temp.next = head;
			head = temp;
		}
		
		else{
			ListNode temp = head;
			for (int i = 1; i<position ; i++){
				temp = temp.getNext();
			}
			
			ListNode newNode = new ListNode(data);
			newNode.next = temp.next;
			temp.setNext(newNode);
			
		}
		length += 1;
		
	}
	
	public ListNode removeFromBeginning(){
		ListNode node =  head;
		if(node != null){
			head = node.getNext();
			node.setNext(null);
		}
		return node;	
	}
	
	public ListNode removeFromEnd(){
		
		if(head == null){
			return null;
		}
		ListNode node = head, q= null, next= node.getNext() ;
		
		if(next == null){
			head = null;
			return node;
		}
		
		while(node.getNext() != null){
			q = node;
			node = next;
		}
		q.setNext(null);

		return node;	
	}
	
	public void removeMatched(ListNode node){
		if(head == null){
			return;
		}
		if(node.equals(head)){
			head = head.getNext();
			return;
		}
		ListNode p = head, q= null;
		
		while((q = p.getNext()) !=null){
			if(q.equals(node)){
				p.setNext(q.getNext());
				return;
			}
			p=q;
		}
		
	}
	
	public void remove(int position){
		if(position < 0){
			position = 0;
		}
		
		if(position >= length){
			position = length;
		}
		
		if(head == null){
			return;
		}
		
		if( position == 0){
			head = head.getNext();
		} else{
			ListNode temp = head;
			for(int i = 1; i< position ; i+=1){
				temp = temp.getNext();
			}
			
			temp.setNext(temp.getNext().getNext());
		}
		 length -= 1;
		
	}
	
	public String toString(){
		
		String result ="[";
		
		if(head == null){
			result = "]";
		}
		
		result = result + head.getData();
		
		ListNode temp = head.getNext();
		
		while(temp != null){
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";
	}
	
	public ListNode reverse(ListNode node) {
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
	
	
	static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
    }
	
	public int length(){
		return length;
	}
	
	public boolean detectLoop(ListNode node){
		ListNode head = node;
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while (slowPtr != null && fastPtr != null && fastPtr.getNext() !=null){
			if(slowPtr == fastPtr){
				return true;
			}
			slowPtr = slowPtr.getNext();
			fastPtr = fastPtr.getNext().getNext();
		}
		
		return false;
	}
	
	
}
