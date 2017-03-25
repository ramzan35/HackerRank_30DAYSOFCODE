import java.util.LinkedList;
import java.util.Stack;
public class Stacky {

	LinkedList list;
	
	public Stacky(){
		list = new LinkedList();
	}
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}
	
	public int pop(){
		return (int) list.removeLast();
	}
	
	public void push(int a){
		list.addLast(a);
	}
	
	public int peek(){
		return (int)list.getLast();
	}
	
	public static void main(String[]args){
//		Stacky obj = new Stacky();
//		obj.push(5);
//		obj.push(6);
//		obj.push(7);
//		obj.push(8);
//		System.out.println(obj.pop());
//		System.out.println(obj.peek());
//		System.out.print(obj.pop()+" ");
//		System.out.print(obj.pop());
		
		Stack<Integer> obj = new Stack<Integer>();
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		System.out.println(obj.pop());
		System.out.println(obj.peek());
		System.out.print(obj.pop()+" ");
		System.out.print(obj.pop());
	}
}
