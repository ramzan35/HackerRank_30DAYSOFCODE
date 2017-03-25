import java.io.*;
import java.util.*;

public class ArrayListX {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int nmbOfArr = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0;i<nmbOfArr;i++){
            int nmbOfInputs = sc.nextInt();
            ArrayList<Integer> x = new ArrayList<Integer>();
            for(int j=0;j<nmbOfInputs;j++){
                x.add(sc.nextInt());
            }
            arr.add(x);
        }
        System.out.println(Arrays.toString(arr.toArray()));
        
        int nmbOfQ = sc.nextInt();
        for(int i = 0;i<nmbOfQ;i++){
        	int array = sc.nextInt();
        	int element = sc.nextInt();
        	try{
        		System.out.println(arr.get(array-1).get(element-1));
        	}catch(Exception e){
        		System.out.println("Error!");
        	}
        }
    }
}