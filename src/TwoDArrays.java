import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxTotal=0,total=0;
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
            	
                total += arr[i][j]+arr[i][j]+arr[i][j];
            }
        }
    }
}
