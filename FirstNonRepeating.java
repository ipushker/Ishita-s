import java.util.*;
public class FirstNonRepeating {
    private static final int MAX_CHAR = 26;  

    public static char nonRep(String s) {
        int[] freq = new int[MAX_CHAR];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "ishitapushker";
        System.out.println(nonRep(s));
    }
}
