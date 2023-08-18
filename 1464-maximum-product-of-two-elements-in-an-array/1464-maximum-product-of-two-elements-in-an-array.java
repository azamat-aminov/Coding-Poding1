class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
        
//         int maxValue = 0;
//         for(int number : nums){
//             if(number > maxValue){
//                 maxValue = number;
//             }
//         }
//         int secondMaxValue = 0;
//         for(int n : nums){
//             if(n > secondMaxValue && n != maxValue){
//                 n = secondMaxValue;
//             }
//         }
        
//         System.out.println(maxValue);
//         System.out.println(secondMaxValue);
        // return -1;
    }
}