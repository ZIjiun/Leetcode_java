import java.util.Stack;

public class Valid_Parentheses {
    static public boolean isValid(String s) {
        char temp;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if ( s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                temp = st.pop();
                if (temp == '(' && s.charAt(i) != ')') {
                    return false;
                }
                if (temp == '[' && s.charAt(i) != ']') {
                    return false;
                }
                if (temp == '{' && s.charAt(i) != '}') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
