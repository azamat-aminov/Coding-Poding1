class Solution {
    public int findNonMinOrMax(int[] nums) {
        
       int N = nums.length;
        
        if(N <= 2){
            return -1;
        }
        
        Arrays.sort(nums);
        
        return nums[1];
        
//         int max = nums[0];
//         int min = nums[0];
        
//         for(int i = 0; i < N; i++){
//             if(nums[i] > max){
//                 max = nums[i];
//             }
//             if(nums[i] < min){
//                 min = nums[i];
//             }
//         }
        
//         int result = 0;
        
//         for(int j = 0; j < N; j++){
//             if(nums[j] != max && nums[j] != min){
//                 result = nums[j];
//             }
//         }
//         return result;
    }
}