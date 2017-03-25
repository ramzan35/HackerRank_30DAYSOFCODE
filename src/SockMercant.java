import java.util.*;

public class SockMercant {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer c[] = new Integer[n];
		int count = 0;
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
		}

		ArrayList<Integer> selected = new ArrayList<Integer>(Arrays.asList(c));

		for(int j = 0;j<selected.size();j++){
			for (int i = j+1; i < selected.size(); i++) {
				if (selected.get(j) == selected.get(i)) {
					selected.remove(j);
					selected.remove(i-1);
					count++;
					j=0;
					i=0;
				}
			}
		}
		System.out.println(count);
		System.out.println(selected.toString());
	}
}
