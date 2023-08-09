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
    }
}