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

        String paramStr = String.valueOf(x);

        char[] chars = paramStr.toCharArray();

        boolean res = false;
        for (int i = 0,j = chars.length - 1; i <= j; i++,j--) {
            if(chars[i] == chars[j]){
                res = true;
            }else{
                return false;
            }
        }

        return res;
    }
}
