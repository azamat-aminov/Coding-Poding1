class Solution {
    public int distinctAverages(int[] nums) {
       
        Set<Float> set = new HashSet<>();
        Arrays.sort(nums);
        int lo = 0;
        int hi = nums.length - 1;
        while(lo < hi){
//             0,1,2,3,4,5
            int min = nums[lo];
            int max = nums[hi];
            float value = ((float) min + (float) max) / 2;
            set.add(value);
            lo++;
            hi--;
        }
        return set.size();
    }
}