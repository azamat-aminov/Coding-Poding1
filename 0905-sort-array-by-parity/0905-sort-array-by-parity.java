class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evens.add(nums[i]);
            }else{
                odds.add(nums[i]);
            }
        }
        evens.addAll(odds);
        
        int[] result = new int[evens.size()];
        
        int index = 0;
        while(index < evens.size()){
            result[index] = evens.get(index);
            index++;
        }
        return result;
    }
}