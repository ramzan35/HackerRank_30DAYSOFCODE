import java.io.*;
import java.util.*;

public class StringTokenizerX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		StringTokenizer multiTokenizer = new StringTokenizer(s, "://.-,'?! ");
		int count = 0;

		System.out.println(multiTokenizer.countTokens());
		
		while (multiTokenizer.hasMoreTokens()) {
			System.out.println(multiTokenizer.nextToken());
		}
		scan.close();
	}
}
