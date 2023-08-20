class Solution {
    public int maxDepth(String s) {
        
        int max = 0;
        int count = 0;
        
        for(String ch : s.split("")){
            if(ch.equals("(")){
                count = count + 1;
                
                if(count > max){
                max = count;
                }
            }else if(ch.equals(")")){
                count = count - 1;
            } 
        }
        return max;
    }
}