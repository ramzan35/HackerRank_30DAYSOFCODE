import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class emailCheckerRegex {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int N = in.nextInt();
		ArrayList<Personx> arr = new ArrayList<Personx>();
		Personx obj = null;

		for (int a0 = 0; a0 < N; a0++) {
			obj = new Personx(in.next(), in.next());
			arr.add(obj);
		}

		Collections.sort(arr, new Comparator<Personx>() {
			public int compare(Personx fruit2, Personx fruit1) {
				return fruit2.fName.compareTo(fruit1.fName);
			}
		});

		regexChecker("([a-z]){1,20}@gmail\\.com{1,50}", arr);

	}

	public static void regexChecker(String theRegex, ArrayList<Personx> arr) {
		Matcher regexMatcher = null;
		for (Personx x : arr) {
			Pattern checkRegex = Pattern.compile(theRegex);
			regexMatcher = checkRegex.matcher(x.email);

			while (regexMatcher.find()) {
				System.out.println(x.fName);
			}
		}
	}
}

class Personx {
	String fName;
	String email;

	Personx(String fName, String email) {
		this.fName = fName;
		this.email = email;
	}
}
