/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 *
 * @author shelin 2021/01/20 10:52
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int res = searchInsert(nums, target);
        System.out.println(res);
    }


    public static int searchInsert(int[] nums, int target) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                res =  i;
                break;
            }
        }
        return res == -1 ? nums.length : res;
    }

}
