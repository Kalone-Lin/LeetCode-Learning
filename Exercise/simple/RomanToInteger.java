package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * lin.she
 *
 * @author shelin 2020/10/29 15:44
 */
public class RomanToInteger {

    public static void main(String[] args) {

        int res = romanToInt("MCMXCIV");

        System.out.println(res);

    }

    public static int romanToInt(String s) {

        Map<Character,Integer> baseMap = new HashMap<>();
        baseMap.put('I',1);
        baseMap.put('V',5);
        baseMap.put('X',10);
        baseMap.put('L',50);
        baseMap.put('C',100);
        baseMap.put('D',500);
        baseMap.put('M',1000);

        char[] chars = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {

            if(i < chars.length - 1 && baseMap.get(chars[i]) < baseMap.get(chars[i + 1])){
                sum -= baseMap.get(chars[i]);
            }else{
                sum += baseMap.get(chars[i]);
            }

        }
        return sum;
    }

}
