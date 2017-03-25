import java.util.*;

public class BitWiseAnd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] set = new int[t];
		int[] nmb = new int[t];

		for (int a0 = 0; a0 < t; a0++) {
			set[a0] = in.nextInt();
			nmb[a0] = in.nextInt();
		}

		int count = 0;
		for (int a0 = 0; a0 < t; a0++) {
			count = 0;
			int x = set[a0];
			for (int i = 1; i < x; i++) {
				for (int j = i+1; j <= x; j++) {
					int and = i&j;
					if (nmb[a0] == and)
						count++;
				}
			}
			System.out.println(count);
		}
	}
}