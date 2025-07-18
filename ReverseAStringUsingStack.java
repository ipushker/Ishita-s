import java.util.Stack;

public class ReverseAStringUsingStack {
     public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())
            stack.push(c);
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "IshitaPushker";
        System.out.println(s);
        System.out.println(reverse(s));
    }
}
