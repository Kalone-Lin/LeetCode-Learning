/**
 * lin.she
 *
 * @author shelin 2020/12/11 15:48
 */
public class LongestCommonPrefix {


    public static void main(String[] args) {
        //String[] param = new String[]{"flower","flow","flight"};
        String[] param = new String[]{"c","acc","ccc"};
        String res = longestCommonPrefix(param);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs.length > 0){
            for (int j = 0; j < strs[0].length(); j++) {
                boolean flag = false;
                for (int i = 0; i < strs.length; i++) {
                    if (strs[i].length() <= j) {
                        flag = false;
                        break;
                    }
                    if (strs[0].charAt(j) == strs[i].charAt(j)) {
                        flag = true;
                    }else {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    prefix.append(strs[0].charAt(j));
                }else {
                    break;
                }
            }
        }
        return prefix.toString();
    }

}
