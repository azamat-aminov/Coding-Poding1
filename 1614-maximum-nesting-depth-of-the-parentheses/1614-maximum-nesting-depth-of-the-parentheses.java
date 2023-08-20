class Solution {
    public int maxDepth(String s) {
        
        int max = 0;
        int count = 0;
        
        for(char ch : s.toCharArray()){
            if(ch =='('){
                count = count + 1;
                
                if(count > max){
                max = count;
                }
            }else if(ch == ')'){
                count = count - 1;
            } 
        }
        return max;
    }
}