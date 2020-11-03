import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * lin.she
 *
 * @author shelin 2020/10/29 16:25
 */
public class ValidParentheses {


    public static void main(String[] args) {

        String s = "([]{})";
        boolean valid = isValid(s);
        System.out.println(valid);

    }

    public static boolean isValid(String s) {

        Map<Character,Character> base = new HashMap<>();
        base.put('(',')');
        base.put('[',']');
        base.put('{','}');

        char[] chars = s.toCharArray();
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            stack.add(chars[i]);
        }

        return true;
    }

}
