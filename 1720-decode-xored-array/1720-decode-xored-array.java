class Solution {
    public int[] decode(int[] encoded, int first) {
        
        // encoded[i] = arr[i] + arr[i + 1];
        // arr[0] = 1; 1 - 1 arr[1] = 0;
        
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for(int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result;
    }
}