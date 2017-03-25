import java.math.BigInteger;
import java.util.Scanner;

public class PrimaityTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not prime");
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("prime");
	}
}
/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      System.out.println((n.isProbablePrime(1)) ? "prime" : "not prime");
   }
}
*/