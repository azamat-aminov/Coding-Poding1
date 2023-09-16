class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        // 4 5 9
        // 4 4 8 9 9

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i = i + 1;
            } else if (nums1[i] > nums2[j]) {
                j = j + 1;
            } else {
                list.add(nums1[i]);
                i = i + 1;
                j = j + 1;
            }
        }

        int[] result = new int[list.size()];
        int index = 0;
        for (Integer element : list) {
            result[index] = element;
            index = index + 1;
        }
        return result; 
    }
}