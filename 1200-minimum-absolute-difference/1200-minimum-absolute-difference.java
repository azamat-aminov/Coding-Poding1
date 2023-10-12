class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        int min = Math.abs(arr[1] - arr[0]);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1; i < arr.length; i++) {
            int difference = arr[i] - arr[i - 1];
            
            if(difference < min) {
                min = difference;
                result.clear();
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }else if(difference == min) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        
        return result;
    }
}