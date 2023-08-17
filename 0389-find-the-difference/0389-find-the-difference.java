class Solution {
    public char findTheDifference(String s, String t) {
        
          
        if(s.length() < t.length()){
             s = s + " ";
        }
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
      
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        char result = ' ';
        
        for(int i = 0; i < tChars.length; i++){
            if(sChars[i] == tChars[i]){
                // do nothin
                continue;
            }else{
                result = tChars[i];
            }
        }    
      return result;
    }
}