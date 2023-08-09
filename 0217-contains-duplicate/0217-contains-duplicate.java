class Solution {
    public boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int num : nums) {
      map.merge(num, 1, Integer::sum);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > 1) {
        return true;
      }
    }
    return false;
  }
}