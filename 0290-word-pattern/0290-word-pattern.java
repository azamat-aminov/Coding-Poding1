class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length){
            return false;
        }
        
        char[] chars = pattern.toCharArray();
        
        Map<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
            char ch = chars[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(ch, words[i]);
            }
        }
        return true;
    }
}