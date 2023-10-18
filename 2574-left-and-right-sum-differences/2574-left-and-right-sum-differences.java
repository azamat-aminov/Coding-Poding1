class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        
        for(int i = 1; i < nums.length; i++) {
            leftSum[0] = 0;
            int sum = 0;
            for(int j = i - 1; j >= 0; j--) {
                sum = sum + nums[j];
            }
            leftSum[i] = sum;
            sum = 0;
        }
        
        for(int i = nums.length - 2; i >= 0; i--) {
            rightSum[nums.length - 1] = 0;
            int sum = 0;
            for(int j = i + 1; j <= nums.length - 1; j++) {
                sum = sum + nums[j];
            }
            rightSum[i] = sum;
            sum = 0;
        }
        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));
        
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
         System.out.println(Arrays.toString(nums));
        // return new int[]{};
        return nums;
    }
}