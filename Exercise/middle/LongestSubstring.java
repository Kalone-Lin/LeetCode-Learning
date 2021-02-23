package middle;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "abcdcba";
        int i = lengthOfLongestSubstring_1(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder subStr = new StringBuilder();
        int longest = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            int j = 0;
            if (subStr.toString().contains(String.valueOf(s.charAt(i)))) {
                i = ++j;
                subStr.setLength(0);
            }
            subStr.append(s.charAt(i));
            longest = subStr.length() > longest ? subStr.length() : longest;
        }
        return longest;
    }

    public static int lengthOfLongestSubstring_1(String s) {
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();
        int res = 0;
        int start = 0;
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }
        return res;
    }

}
