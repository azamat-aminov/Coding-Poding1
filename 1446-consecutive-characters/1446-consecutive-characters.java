class Solution {
    public int maxPower(String s) {
        
        char[] letters = s.toCharArray();
        int counter = 0;
        int result = 0;
         for (int i = 0; i < letters.length - 1 ; i++) {
             if(letters[i] == letters[i + 1]){
                 counter = counter + 1;
             }else{
                 result = Math.max(result, counter);
                 counter = 0;
             }
         }
        return Math.max(result, counter) + 1;
    }
}