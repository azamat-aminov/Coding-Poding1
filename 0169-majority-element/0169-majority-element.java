class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums){
            map.merge(num, 1, Integer::sum);
            
        }
        
        Integer maxValue = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if( entry.getValue() > maxValue){
               maxValue = entry.getValue();
            }
        }
        
        for(Map.Entry<Integer, Integer> result : map.entrySet()){
           if(result.getValue() == maxValue){
               return result.getKey();
           }
        }
        return -1;
    }
}