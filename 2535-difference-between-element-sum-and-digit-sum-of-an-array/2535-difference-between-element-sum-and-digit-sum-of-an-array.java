class Solution {
    public int differenceOfSum(int[] nums) {
        
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        
        int digitsSum = 0;
        
        for(int e : nums){
         while(e > 0){
             digitsSum = digitsSum + e % 10;
             e = e / 10;
         }
        }
        
        return Math.abs(digitsSum - sum);
    }
}