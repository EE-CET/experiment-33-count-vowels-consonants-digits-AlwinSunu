import java.util.Scanner;

public class CharFrequency {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        int v = 0, c = 0, d = 0, sp = 0;
        String lower = S.toLowerCase();

        for (int i = 0; i < S.length(); i++) {
            char ch = lower.charAt(i);

            if (Character.isDigit(ch)) {
                d++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v++;
                } else {
                    c++;
                }
            } else if (!Character.isWhitespace(ch)) {
                sp++;
            }
        }

        System.out.println(v + " " + c + " " + d + " " + sp);
    }
}
