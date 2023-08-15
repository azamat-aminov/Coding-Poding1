class Solution {
    public String finalString(String s) {
        
        String[] strings = s.split("");
        StringBuilder build = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(strings[i].equals("i")){
               build.reverse();
            }else{
                build.append(strings[i]); 
            }
        }
        return build.toString();
    }
}