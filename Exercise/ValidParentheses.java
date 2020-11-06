import java.util.*;

/**
 * lin.she
 *
 * @author shelin 2020/10/29 16:25
 */
public class ValidParentheses {


    public static void main(String[] args) {

        String s = "{[]()([])}";
        boolean valid = isValid(s);
        System.out.println(valid);

    }




    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        Stack<Character> stackAfter = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            switch(chars[i]){
                case '{':
                    stack.push(chars[i]);
                    break;
                case '[':
                    stack.push(chars[i]);
                    break;
                case '(':
                    stack.push(chars[i]);
                    break;
                case '}':
                    if(!stack.empty() && stack.peek() == '{'){
                        stack.pop();
                    }else {
                        stackAfter.push(chars[i]);
                    }
                    break;
                case ']':
                    if(!stack.empty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        stackAfter.push(chars[i]);
                    }
                    break;
                case ')':
                    if(!stack.empty() && stack.peek() == '('){
                        stack.pop();
                    }else {
                        stackAfter.push(chars[i]);
                    }
                    break;
            }
        }

        if(stack.empty() && stackAfter.empty()){
            return true;
        }else {
            return false;
        }
    }

}
