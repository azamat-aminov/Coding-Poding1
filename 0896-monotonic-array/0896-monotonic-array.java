class Solution {
    public boolean isMonotonic(int[] nums) {
        
        int N = nums.length;
        int firstCounter = 0;
        int secondCounter = 0;

        for (int i = 1; i < N; i++) {
            if (nums[i] == nums[i - 1]) {
                firstCounter++;
                secondCounter++;
            } else {
                if (less(nums[i], nums[i - 1])) {
                    firstCounter++;
                } else {
                    secondCounter++;
                }
            }
        }
        return firstCounter == N - 1 || secondCounter == N - 1;
    }

    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
}