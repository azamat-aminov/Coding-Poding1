class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < prices.length; i++) {
            for(int j = 0; j < prices.length; j++) {
                if(i != j) {
                    int sum = prices[i] + prices[j];
                    min = Math.min(sum, min);
                }
            }
        }
        
        int result = money - min;
        
        if(result < 0) {
            return money;
        } 
        
        return result;
    }
}