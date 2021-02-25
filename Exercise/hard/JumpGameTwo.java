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
        int[] nums = {10,9,8,7,6,5,4,3,2,1,1,0};
        int jump = jump(nums);
        System.out.println(jump);
    }

    public static int jump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        if (nums[0] >= nums.length - 1) {
            return 1;
        }
        int res = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i = index) {
            int maxNum = 0;
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
}
