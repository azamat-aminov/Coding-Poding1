class Solution {
    public int sumOfUnique(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int element : nums){
            map.merge(element, 1, Integer::sum);
        }
        
        int sum = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                sum = sum + entry.getKey();
            }
        }
        
        return sum;
    }
}