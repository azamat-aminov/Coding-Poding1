class Solution {
    public boolean detectCapitalUse(String word) {
       // min 65
       // max 90    
        int upperCaseCounter = 0;
        int lowerCaseCounter = 0;
        boolean isStartsWithUpperCase = false;
        byte[] bytes = word.getBytes();
        for(int i = 0; i < bytes.length; i++){
            if(bytes[i] >= 65 && bytes[i] <= 90) {
                upperCaseCounter = upperCaseCounter + 1;
            }
            if(bytes[i] >= 97 && bytes[i] <= 122) {
                lowerCaseCounter = lowerCaseCounter + 1;
            }
            if(bytes[0]>=65 && bytes[0] <=90){
                isStartsWithUpperCase = true;
            }
        }
        return upperCaseCounter == bytes.length || lowerCaseCounter == bytes.length || 
            (lowerCaseCounter == bytes.length - 1 && isStartsWithUpperCase);
    }
}