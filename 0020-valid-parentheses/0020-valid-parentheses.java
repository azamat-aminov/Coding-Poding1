class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
             stack.push(ch);
            }
            
            if(stack.isEmpty()){
                return false;
            }
            
            char currentChar;
            
            switch(ch){
                case ')' :
                  currentChar = stack.pop();
                    if(currentChar == '{' || currentChar == '[')
                        return false;
                    break;
                case '}' :
                  currentChar = stack.pop();
                    if(currentChar == '(' || currentChar == '[')
                        return false;
                    break;
                case ']' :
                  currentChar = stack.pop();
                    if(currentChar == '{' || currentChar == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}