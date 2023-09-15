class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        Set<Integer> sets1 = new HashSet<>();
        
        Set<Integer> sets2 = new HashSet<>();
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < nums1.length ; i++) {
            sets1.add(nums1[i]);
        }
        
        for (int i = 0; i <nums2.length; i++) {
            sets2.add(nums2[i]);
        }
        

        for (Integer i : sets1) {
            if (sets2.contains(i)) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}