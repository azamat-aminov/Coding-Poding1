class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < accounts.length; i++) {
            int[] ints = accounts[i];
            int sum = 0;
            System.out.println(Arrays.toString(ints));
            for(int j = 0; j < ints.length; j++) {
                sum += ints[j];
            }
            if(sum > max){
                max = sum;
            }
        }
        
        return max;
    }
}