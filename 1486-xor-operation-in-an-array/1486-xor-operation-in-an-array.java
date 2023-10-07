class Solution {
    public int xorOperation(int n, int start) {
        
        int[] array = new int[n];
        
        int result = 0;
        
        for(int i = 0; i < n; i++) {
            array[i] = start + 2 * i;
            result ^= array[i];
        }
        
        System.out.println(Arrays.toString(array));
        
        return result;
    }
}