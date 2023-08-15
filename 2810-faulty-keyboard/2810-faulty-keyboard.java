class Solution {
    public String finalString(String s) {
        
        char[] chars = s.toCharArray();
        StringBuilder build = new StringBuilder();
        
        for(char ch: chars){
            if(ch == 'i'){
               build.reverse();
            }else{
                build.append(ch); 
            }
        }
        return build.toString();
    }
}