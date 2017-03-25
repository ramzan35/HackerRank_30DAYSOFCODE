import java.util.Random;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics obj = new Generics();
		obj.myMethod();
	}
	
	public void myMethod(){
		Random rand = new Random();
		
		Integer[] arr1 = new Integer[5];
		String[] arr2 = new String[5];
		
		for(int i = 0;i<arr1.length;i++){
			arr1[i] = rand.nextInt(6);
		}
		
		for(int i = 0;i<arr2.length;i++){
			arr2[i] = String.valueOf(rand.nextInt(20));
		}
		
		printArray(arr1);
		printArray(arr2);
	}
	
	public <E> void printArray(E[] arr){
		for(E element : arr)
			System.out.print(element+" ");
		
		System.out.println();
	}
	
}
