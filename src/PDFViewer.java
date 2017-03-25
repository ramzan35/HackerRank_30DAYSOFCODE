import java.util.Scanner;

public class PDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int height = 0;
        int heighest = 0;
        
        int max_h = 0;
        int res = 0;
        for(int i = 0; i < word.length(); i++){
            res = (int)word.charAt(i);
            res = res % 48;
            if(h[res-1] < max_h ){
                continue;
            }else{
                max_h = h[res-1];
            }
        }
        System.out.println(max_h * word.length());
    }
}