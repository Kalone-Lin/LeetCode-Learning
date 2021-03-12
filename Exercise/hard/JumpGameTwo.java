package hard;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 *
 * @author shelin 2021/02/23 16:13
 */
public class JumpGameTwo {

    public static void main(String[] args) {
        //2,3,1,1,4
        //2,2,2,3,4
        //0
        //1,2
        //2,3,1,1,4
        //1,2,3
        //1,1,1,1,1
        //10,9,8,7,6,5,4,3,2,1,1,0
        //4,1,1,3,1,1,1
        int[] nums = {4,1,1,3,1,1,1};
        int jump = jump(nums);
        System.out.println(jump);
    }

    public static int jump (int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        if (nums[0] >= nums.length - 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < nums.length;) {
            int index = i;
            int value = nums[i];
            int allStep = index + value;
            for (int j = i; j < (allStep > nums.length ? nums.length : allStep) ; j++) {
                if (nums[j] > value) {
                    i = j;
                }
            }
            if (index == i) {
                i += nums[i];
            }
            res++;
            if (index + value >= nums.length - 1) {
                break;
            }
        }
        return res;
    }

    public static int jump_1(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        if (nums[0] >= nums.length - 1) {
            return 1;
        }
        int res = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i = index) {
            int maxNum = nums[0];
            for (int j = i + 1; j <= nums[i] + i; j++) {
                if (nums[j] >= maxNum) {
                    maxNum = nums[j];
                    index = j;
                }
            }
            res++;
            if (index + maxNum >= nums.length - 1) {
                return res;
            }
        }
        return res;
    }

    public int jump_2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 0;
        if(nums.length == 1) {
            return 0;
        }
        dp[1] = 1;
        for(int i = 2; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = i - 1; j >= 0; j--) {
                if(nums[j] >= i - j) {
                    if(dp[j] < Integer.MAX_VALUE && dp[j] + 1 < min) {
                        min = dp[j] + 1;
                    }
                }
            }
            dp[i] = min;
        }
        return dp[nums.length - 1];
    }
}
