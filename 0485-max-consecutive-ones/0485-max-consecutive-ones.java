class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int counter = 0;
        
        List<Integer> counterSaver = new ArrayList<>();
        
        for(int i = 0; i <= nums.length - 1; i++){
            if(nums[i] == 1){
                counter = counter + 1;
            }else{
                counterSaver.add(counter);
                counter = 0;
            }
            if(nums[nums.length - 1] == 1){
               counterSaver.add(counter); 
            }
        }
        
        System.out.println(counterSaver);
        
        int max = 0;
        
        for(int n : counterSaver){
            if(n > max){
                max = n;
            }
        }
        
        return max;
    }
}