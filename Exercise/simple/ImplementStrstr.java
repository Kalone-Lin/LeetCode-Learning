package simple;

/**
 * description
 *
 * @author shelin 2021/01/06 18:13
 */
public class ImplementStrstr {
    public static void main(String[] args) {
        String haystack = "";
        String needle = "a";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }

    public static int strStr(String haystack, String needle) {
        if ("".equals(haystack) && "".equals(needle)) {
            return 0;
        }
        int i = 0;
        while (i < haystack.length()) {
            if (haystack.substring(i).startsWith(needle)) {
                return i;
            }
            i++;
        }
        return i == haystack.length() ? -1 : i;
    }
}
