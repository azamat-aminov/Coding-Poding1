class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        
         for(int i = 0; i < nums.length + 1; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}