import java.util.Stack;
public class Valid_Parentheses_20 {

//    public class Solution {

        public static boolean isValid(String s) {
            if (s.length() == 0 || s.length() == 1) {
                return false;
            }

            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (c == '(' || c == '{' || c == '[') {
                    st.push(c);
                } else if (c == ')') {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        return false; // Mismatched closing bracket
                    }
                } else if (c == '}') {
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false; // Mismatched closing bracket
                    }
                } else if (c == ']') {
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else {
                        return false; // Mismatched closing bracket
                    }
                }
            }

            return st.isEmpty();
        }


        public static void main(String[] args) {
            String st = "()({[}])";
            System.out.println(isValid(st));
        }
    }
//}
