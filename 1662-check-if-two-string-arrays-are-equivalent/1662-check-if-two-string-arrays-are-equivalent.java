class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder firstBuilder = new StringBuilder();
        
        for(String firstWord : word1){
            firstBuilder.append(firstWord);
        }
        
        StringBuilder secondBuilder = new StringBuilder();
        
        for(String secondWord : word2){
            secondBuilder.append(secondWord);
        }
        
        return firstBuilder.toString().equals(secondBuilder.toString());
    }
}