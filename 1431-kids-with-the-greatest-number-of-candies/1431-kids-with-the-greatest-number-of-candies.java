class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>(candies.length);
        
        for(int i = 0; i < candies.length; i++) {
            int current = candies[i] + extraCandies;
            int max = 0;
            for(int j = 0; j < candies.length; j++) {
                 if(candies[j] > max && i != j) {
                     max = candies[j];
                 }
            }
             result.add(current >= max);
        }       
        return result;
    }
}