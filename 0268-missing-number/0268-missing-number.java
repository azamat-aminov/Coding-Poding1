class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hashSet.add(nums[i]);
        }
        int arraylength = nums.length + 1;
         for(int i = 0; i < arraylength; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}