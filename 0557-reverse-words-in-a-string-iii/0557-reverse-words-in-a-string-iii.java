class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
            result.append(words[i]).append(" ");
        }
        
        
        return result.toString().substring(0, result.toString().length() - 1);
    }
}