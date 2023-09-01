public class Solution {
    public int[] countBits(int num) {
        
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {  
            int number = i;
            int bits = 0;
            while (number > 0) {
                if ((number & 1) == 1) {
                    bits++;
                }
                number = number >> 1;
            }
            result[i] = bits;
        }
        return result;
    }
}