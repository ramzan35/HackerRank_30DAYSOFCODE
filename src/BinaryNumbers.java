
import java.io.*;
import java.util.*;

public class BinaryNumbers {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		int ithuru = 0, cons = 0, maxCons = 0;

		while (true) {
			ithuru = value % 2;
			value = value / 2;
			if (ithuru == 1) {
				cons++;
				if (maxCons < cons)
					maxCons = cons;
			} else {
				cons = 0;
			}
			if (value == 0)
				break;
			else if (value == 1) {
				cons++;
				if (maxCons < cons)
					maxCons = cons;
				break;
			}
		}
		System.out.println(maxCons);
	}
}