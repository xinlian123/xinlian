public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if(nums.length==0)
        return nums[0];
        Arrays.sort(nums);
        return nums[nums.length/3];
    }
}