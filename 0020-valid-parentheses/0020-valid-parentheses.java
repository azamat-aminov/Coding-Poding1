class Solution {
    public boolean isValid(String s) {
        
        Deque<String> stack = new ArrayDeque<>();
        
        for(String ch: s.split("")){
            if(ch.equals("(") || ch.equals("{") || ch.equals("[")){
             stack.push(ch);
            }
            if(stack.isEmpty()){
                return false;
            }
            
            String currentChar;
            
            switch(ch){
                case ")" :
                  currentChar = stack.pop();
                    if(currentChar.equals("{") || currentChar.equals("["))
                        return false;
                    break;
                case "}" :
                  currentChar = stack.pop();
                    if(currentChar.equals("(") || currentChar.equals("["))
                        return false;
                    break;
                case "]" :
                  currentChar = stack.pop();
                    if(currentChar.equals("{") || currentChar.equals("("))
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}