import java.util.Stack;

public class Valid_Parentheses_20 {

    public static boolean isValid(String s) {

        if(s.length() == 0 || s.length() == 1){
            return false;
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }

            else if(c == ')'){
                while(!st.empty()){
                    if(st.peek() == '('){
                        break;
                    }
                    st.pop();
                }
            }

            else if(c == '}'){
                while(!st.empty()){
                    if(st.peek() == '{'){
                        break;
                    }
                    st.pop();
                }
            }

            else if(c == ']'){
                while(!st.empty()){
                    if(st.peek() == '['){
                        break;
                    }
                    st.pop();
                }
            }

        }

        if(!st.empty()){

            return false;

        }


        return true;



    }

    public static void main(String[] args) {

        String st = "()(";
        System.out.println(isValid(st));

    }
}
