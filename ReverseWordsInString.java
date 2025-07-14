import java.util.*;
public class ReverseWordsInString {
     static String reverseWords(String str) {
      
        // Convert the string to mutable StringBuilder
        StringBuilder s = new StringBuilder(str);
        
        // Reverse the whole string
        s.reverse();
        
        int n = s.length();
        int i = 0;
        
        for (int l = 0; l < n; ++l) {
            if (s.charAt(l) != '.') {
              
                // go to the beginning of the word
                if (i != 0) s.setCharAt(i++, '.');

                // go to the end of the word
                int r = l;
                while (r < n && s.charAt(r) != '.') {
                    s.setCharAt(i++, s.charAt(r++));
                }

                // reverse the word
                int start = i - (r - l);
                int end = i - 1;
                while (start < end) {
                    char temp = s.charAt(start);
                    s.setCharAt(start, s.charAt(end));
                    s.setCharAt(end, temp);
                    start++;
                    end--;
                }

                // move to the next word
                l = r;
            }
        }

        return s.substring(0, i);
    }
 public static void main(String[] args) {
        String str = "..Hey..i'm..ishita.";
        System.out.println(reverseWords(str));
    }
}
