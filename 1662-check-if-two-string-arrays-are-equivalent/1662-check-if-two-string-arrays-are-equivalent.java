class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String firstFullWord = "";
        String secondFullWord = "";
        
        for(String firstWord : word1){
            firstFullWord = firstFullWord + firstWord;
        }
        
        for(String secondWord : word2){
            secondFullWord = secondFullWord + secondWord;
        }
        
        return firstFullWord.equals(secondFullWord);
    }
}