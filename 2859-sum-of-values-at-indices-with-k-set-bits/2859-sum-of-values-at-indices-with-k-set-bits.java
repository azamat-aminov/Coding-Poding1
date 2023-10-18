class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum = 0;  
        int index = 0;
        for(int number : nums) {
            if(countSetBits(index) == k) {
                sum = sum + number;
            }
             index++;
        }
        return sum;
    }
    
    public int countSetBits(int n) {
        int count = 0;      
        while(n > 0) {
            count += n & 1;
            n >>= 1;
        }   
        return count;
    }
}