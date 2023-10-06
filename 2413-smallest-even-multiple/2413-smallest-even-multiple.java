class Solution {
    public int smallestEvenMultiple(int n) {
        
        int result = 0;
        
        for(int i = 2; i <= 10000; i++){
            if(i % n == 0 && i % 2 == 0){
                result =i;
                break;
            }
        }
        return result;
    }
}