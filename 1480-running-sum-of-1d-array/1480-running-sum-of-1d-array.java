class Solution {
    public int[] runningSum(int[] nums) {
        
        
            for(int i = 0; i < nums.length - 1; i++) {
                nums[i+ 1] = nums[i+1] + nums[i];
            }
        
        System.out.println(Arrays.toString(nums));
        
        // return new int[]{};
        return nums;
    }
}