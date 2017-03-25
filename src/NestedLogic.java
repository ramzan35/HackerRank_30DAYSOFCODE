import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int rD = sc.nextInt();
		int rM = sc.nextInt();
		int rY = sc.nextInt();
		int eD = sc.nextInt();
		int eM = sc.nextInt();
		int eY = sc.nextInt();
		int fine = 0;

		if (eY < rY) {
			fine = 10000;
		} else if (eY == rY) {
			if (eM < rM) {
				fine = (rM - eM) * 500;
			} else if (eM == rM) {
				if (eD < rM) {
					fine = (rD - eD) * 15;
				} else {
					fine = 0;
				}
			} else {
				fine = 0;
			}
		} else {
			fine = 0;
		}

		System.out.println(fine);
	}
}
/*
 * Scanner scan = new Scanner(System.in);
 * 
 * int actuallDay = scan.nextInt(); int actuallMonth = scan.nextInt(); int
 * actuallYear = scan.nextInt();
 * 
 * int expectedDay = scan.nextInt(); int expectedMonth = scan.nextInt(); int
 * expectedYear = scan.nextInt();
 * 
 * if(actuallYear>expectedYear){ System.out.println("10000"); }else
 * if(actuallYear==expectedYear){ if(actuallMonth>expectedMonth){
 * System.out.println(""+500*(actuallMonth-expectedMonth)); }else
 * if(actuallMonth==expectedMonth){ if(actuallDay>expectedDay){
 * System.out.println(""+15*(actuallDay-expectedDay)); }else{
 * System.out.println("0"); } }else{ System.out.println("0"); } }else{
 * System.out.println("0"); }
 */