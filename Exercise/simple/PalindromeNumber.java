package simple;

/**
 * lin.she
 *
 * @author shelin 2020/10/29 15:23
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-10));
    }

    public static boolean isPalindrome(int x) {

        char[] chars = String.valueOf(x).toCharArray();

        for (int i = 0,j = chars.length - 1; i <= j; i++,j--) {
            if(chars[i] != chars[j]){
                return false;
            }
        }

        return true;
    }
}
