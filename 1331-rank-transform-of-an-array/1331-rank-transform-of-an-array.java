class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        Set<Integer> hold = new TreeSet<>();
        
        for(int e : arr) {
            hold.add(e);
        }
        
        Map<Integer, Integer> map = new TreeMap<>();
        int rank = 1;
        for(int e : hold) {
            map.put(e, rank++);
        }

        int[] result = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }
        
        return result;
    }
}