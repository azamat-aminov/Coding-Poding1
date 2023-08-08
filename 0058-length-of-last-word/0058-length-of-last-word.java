class Solution {
    public int lengthOfLastWord(String s) {
        
    // String[] words =  s.split(" ");
    // return words[words.length - 1].length();
    
    int lengthOfTheWord = 0;
        
    for(int i = s.length() - 1; i >= 0; i--){
        if (s.charAt(i) != ' '){
            lengthOfTheWord = lengthOfTheWord + 1;
        }else{
            if(lengthOfTheWord > 0){
                return lengthOfTheWord;
            }
        }
    }
    return lengthOfTheWord;
    }  
}