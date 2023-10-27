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
        
        System.out.println(map);
        int[] result = new int[arr.length];
        
        int index = 0;
        for(int e : arr) {
            result[index] = map.get(e);
            index++;
        }
        
        return result;
    }
}