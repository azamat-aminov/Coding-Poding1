class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result = new int[nums.length];
        
        int index = 0;
        for(int number : nums){
            result[index] = number * number;
            index++;
        }
        
        Arrays.sort(result);
        
        return result;
    }
}