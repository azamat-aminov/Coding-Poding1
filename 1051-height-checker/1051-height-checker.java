class Solution {
    public int heightChecker(int[] heights) {
        
//         int[] temp = new int[heights.length];
        
//         for(int i = 0; i < heights.length; i++){
//             temp[i] = heights[i];
//         }
        
        final int[]  temp = Arrays.copyOf(heights, heights.length);
        
        Arrays.sort(heights);
        
        int counter = 0;
        
         for(int i = 0; i < temp.length; i++){
            if(temp[i] != heights[i]){
                counter++;
            }
        }
        return counter;
    }
}