import java.util.LinkedList;

public class Queuey {

	LinkedList queue;
	
	public Queuey(){
		queue = new LinkedList();
	}
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public int size(){
		return queue.size();
	}
	
	public void enqueue(int a){
		queue.addLast(a);
	}
	
	public int dequeue(){
		return (int) queue.remove(0);
	}
	
	public int peek(){
		return (int) queue.get(0);
	}
	
	public static void main(String[]args){
		Queuey obj = new Queuey();
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(7);
		obj.enqueue(8);
		System.out.println(obj.dequeue());
		System.out.println(obj.peek());
		System.out.print(obj.dequeue()+" ");
		System.out.print(obj.dequeue());
		
	}
}
