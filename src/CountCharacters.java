import java.util.*;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, special = 0;

        for (char ch : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels++;
            } 
            else if (Character.isLetter(ch)) {
                consonants++;
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                special++; // includes spaces
            }
        }

        System.out.println(vowels + " " + consonants + " " + digits + " " + special);
    }
}
