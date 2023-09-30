class Solution {
    public int thirdMax(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for(int e : nums){
            set.add(e);
        }
        
        List<Integer> list = new ArrayList<>();
            for(int e : set){
                list.add(e);
            }
        
        Collections.sort(list);
        
        if(list.size() < 3){
            result = list.get(list.size() - 1);
        }else{
            result = list.get(list.size() - 3);
        }
        return result;
    }
}