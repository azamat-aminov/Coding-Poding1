class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        System.out.println(nums.length/3);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int e : nums){
            map.merge(e, 1, Integer::sum);
        }
        
        System.out.println(map);
        
        List<Integer> result = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                result.add(entry.getKey());
            }
        } 
        
        return result;
    }
}