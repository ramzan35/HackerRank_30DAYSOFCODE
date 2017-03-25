import java.io.*;
import java.util.*;

public class ArrayIte {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int negVal=0;
        int[] a = new int[value];
        for(int i = 0;i<value;i++){
            a[i] = sc.nextInt();
        }
        for(int x : a){
            if(x<0)
            negVal++;
        }
        for(int i = 0;i<value;i++){
        	int val = a[i];
            for(int j = i+1;j<value;j++){
                val += a[j];
                if(val<0)
                    negVal++;
            }
        }
        System.out.println(negVal);
    }
    
}