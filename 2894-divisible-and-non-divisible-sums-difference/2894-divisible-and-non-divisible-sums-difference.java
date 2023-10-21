class Solution {
    public int differenceOfSums(int n, int m) {
        
        // int num1 = 0;
        // int num2 = 0;
        
        int num1 = IntStream.rangeClosed(1, n).filter(value -> value % m != 0).sum();
        int num2 = IntStream.rangeClosed(1, n).filter(value -> value % m == 0).sum();
        
        // for(int i = 1; i <= n; i++) {
        //     if(i % m != 0) {
        //         num1 += i;
        //     } else {
        //         num2 += i;
        //     }
        // }
        return num1 - num2;
    }
}