class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String outPut = "";
        for(int i = 0; i < k; i++ ) {
           outPut = outPut + words[i] + " ";
        }
        return outPut.substring(0, outPut.length() - 1);
    }
}