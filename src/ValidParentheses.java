import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){
        // using stack and pushing each character
        Stack<Character> chars = new Stack<>();
        for (char c: s.toCharArray()){

            if (c == '(' || c == '{' || c == '['){
                chars.push(c);
            } else if (c == ')' && !chars.isEmpty() && chars.peek() == '('){
                chars.pop();
            } else if (c == '}' && !chars.isEmpty() && chars.peek() == '{'){
                chars.pop();
            } else if (c == ']' && !chars.isEmpty() && chars.peek() == '['){
                chars.pop();
            } else {
                return false;
            }
        }
        return chars.isEmpty();
    }       // T: O(n) S: O(n)

    public static boolean isValid2(String s){
        //using stack and pushing complementary characters
        Stack<Character> chars = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '('){
                chars.push(')');
            }else if (c == '{'){
                chars.push('}');
            } else if (c == '['){
                chars.push(']');
            } else if (chars.isEmpty() || chars.pop() != c){
                return false;
            }
        }
        return chars.isEmpty();
    }       // T: O(n) S: O(n)

    public static void main(String[] args) {
        isValid("{}()[]");
        System.out.println(isValid2("{}()[]"));  //true
        System.out.println(isValid2("{)}([)[]"));    //false
        System.out.println(isValid2("{}()["));   //false
        System.out.println(isValid2("{([])}"));  //true
        System.out.println(isValid2("]()["));  //false

    }
}
