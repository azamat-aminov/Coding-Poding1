class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> result = new ArrayList<>();
        
        for(int i = 0; i < candies.length; i++) {
            int current = candies[i] + extraCandies;
            int max = 0;
            for(int j = 0; j < candies.length; j++) {
                 if(candies[j] > max && i != j) {
                     max = candies[j];
                 }
            }
            System.out.println(max);
             if(current >= max) {
                     result.add(true);
                 max = 0;
                 }else{
                     result.add(false);
                 max = 0;
                 }
        }
        
        System.out.println(result);
        
        return result;
    }
}