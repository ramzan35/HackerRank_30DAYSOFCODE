import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<arrSize;i++){
            list.add(sc.nextInt());
        }
        
        int nmbOfQ = sc.nextInt();
        for(int i = 0;i<nmbOfQ;i++){
           String cmd = sc.next();
            if(cmd.equals("Insert")){
                list.add(sc.nextInt(),sc.nextInt());
            }
            else if(cmd.equals("Delete")){
                list.remove(sc.nextInt());
            }
        }
        for(int a : list)
            System.out.print(a+" ");
    }
}