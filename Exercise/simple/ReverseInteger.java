package simple;

/**
 * lin.she
 *
 * @author shelin 2020/10/29 11:27
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int reverse = reverse(120);
        System.out.println(reverse);
    }

    public static int reverse(int x){

        int resInt = 0;
        while(x != 0){
            int temp = x % 10;

            if(resInt > Integer.MAX_VALUE / 10 || (resInt == Integer.MAX_VALUE / 10 && temp > 7)){
                return 0;
            }

            if(resInt < Integer.MIN_VALUE / 10 || (resInt == Integer.MIN_VALUE / 10 && temp < -8)){
                return 0;
            }

            x /= 10;

            resInt = resInt * 10 + temp;

        }

        return resInt;

    }

}
