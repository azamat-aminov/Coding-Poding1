class Solution {
    public boolean isMonotonic(int[] nums) {
       return isSorted(nums);
    }
    
    private boolean isSorted(int [] a){
        
        int firstCounter = 0;
        int secondCounter = 0;
        
        for(int i = 1; i < a.length; i++){
            if(a[i] == a[i - 1]){
                firstCounter++; 
                secondCounter++;
            }else{
                if(less(a[i], a[i - 1])){
                firstCounter++;
            }else{
                secondCounter++;
            }
            }
        }
        
        if(firstCounter == a.length  - 1 || secondCounter == a.length - 1){
            return true;
        }
        return false;
    }
    
    public boolean less(Comparable v, Comparable w){
       return v.compareTo(w) < 0;
    }
}