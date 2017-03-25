
public class LinkedList {

	Node head;
	int count;
	
	public LinkedList(Node newHead){
		head = newHead;
		count = 1;
	}
	
	public void add(int newData){
		Node temp = new Node(newData);
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(temp);
		count++;
	}

	public int get(int index) {
		if(index <= 0)
			return -1;
		Node current = head;
		for(int i = 0;i<index;i++){
			current = current.getNext();
		}
		return current.getData();
	}

	public int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return head == null;
	}

	public void Remove(){
		Node current = head;
		while(current.getNext() != null){
			current = current.getNext();
		}
		current.setNext(null);
		count--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
