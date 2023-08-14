class Solution {
    public int searchInsert(int[] nums, int target) {
        
        List<Integer> numbers = new ArrayList<>();
        
        for(int element : nums){
            numbers.add(element);
        }
        numbers.add(target);
        Collections.sort(numbers);
         return numbers.indexOf(target);
        }
    }