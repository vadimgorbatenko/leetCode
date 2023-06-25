/**
 * 136. Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * <a href="https://leetcode.com/problems/single-number/">...</a>
 */
public class Problem136 {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        System.gc();
        return res;
    }

//    public int singleNumberMine(int[] nums) {
//        if(nums.length == 1){
//            return nums[0];
//        }
//
//        Arrays.sort(nums);
//        for (int i = 0; i<nums.length/2; i++){
//            int j = 2 * i;
//            if(nums[j] != nums[j +1]){
//                return nums[j];
//            }
//        }
//        return nums[nums.length - 1];
//    }
}
