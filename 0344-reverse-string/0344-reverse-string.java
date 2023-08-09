class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int start = 0;
        int end = len - 1;
        
        while(start < end){
            char temp = s[start]; //this is first element
            s[start] = s[end];
            s[end] = temp;
            start = start + 1;
            end = end - 1;
        } 
        
        // for(int i = 0; i < len / 2; i++){
        //     char temp = s[i];
        //     s[i] = s[len - i - 1];
        //     s[len - i - 1] = temp;
        // }
    }
}