class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++){
        //    if (map.get(nums[i]) == null){
        //        map.put(nums[i], 1);
        //    }else{
        //      map.put(nums[i], map.get(nums[i]) + 1);  
        //    }     
        // }
        
        for(int num : nums){
            map.merge(num, 1, Integer::sum);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 2){
                return entry.getKey();
      }
    }
        return -1;
    }
}