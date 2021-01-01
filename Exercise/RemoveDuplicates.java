public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1};
        int res = removeDuplicates(nums);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0,j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

}
