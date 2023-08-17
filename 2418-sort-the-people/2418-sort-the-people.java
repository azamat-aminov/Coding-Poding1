class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        Map<Integer, String> storeNames = new HashMap<>();
        
        for(int i = 0; i < names.length; i++){
            storeNames.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        
        String[] result = new String[storeNames.size()];
        
        int a = 0;
         for(int k = heights.length - 1; k >=0 ; k--){
             result[a++] = storeNames.get(heights[k]);
         }
        return result;
    }
}