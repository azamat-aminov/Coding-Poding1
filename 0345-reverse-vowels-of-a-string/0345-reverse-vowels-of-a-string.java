class Solution {
    public String reverseVowels(String s) {
        
        
        char[] chars = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(int k = 0; k < chars.length; k++){
            if(isVoewl(chars[k])){
                stack.add(chars[k]);
            }
        }
        for(int i = 0; i < chars.length; i++){
            if(isVoewl(chars[i])){
                chars[i] = stack.pop();
            }
        }
        return new String(chars);
    }
    
    public boolean isVoewl(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'|| ch == 'U';
    }
}