package middle;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder subStr = new StringBuilder();
        int longest = 0;
        for (int j = 0, i = 0; i < s.toCharArray().length; i++) {
            if (subStr.toString().contains(String.valueOf(s.charAt(i)))) {
                j++;
                i = j;
                subStr = new StringBuilder();
            }
            subStr.append(s.charAt(i));
            longest = subStr.length() > longest ? subStr.length() : longest;
        }
        return longest;
    }

}
