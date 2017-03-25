import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeAndComplexity {

	public static void main(String[] args) {
		/* Enter your code here. */
		Scanner sc = new Scanner(System.in);
		int rD = sc.nextInt();
		int[] arr = new int[rD];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			flag = true;
			if(arr[i]<=1){
				flag = false;
			}
			else if(arr[i]<=4){
				for(int j = 4;j*j<arr[i];j++){
					if(arr[i]%2==0 || arr[i]%3==0)
						flag = false;
				}
			}
		}
	}
}
