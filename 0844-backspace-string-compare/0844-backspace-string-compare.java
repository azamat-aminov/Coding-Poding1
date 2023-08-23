class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> firstStack = new Stack<>();
        Stack<Character> secondStack = new Stack<>();
        
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        
        for(int i = 0; i < first.length; i++){
            if(first[i] == '#'){
                if(!firstStack.isEmpty()){
                    firstStack.pop();
                }
            }else{
                firstStack.push(first[i]);   
            }
        }
        for(int k = 0; k < second.length; k++){
            if(second[k] == '#'){
                if(!secondStack.isEmpty()){
                    secondStack.pop();
                }
            }else{
                secondStack.push(second[k]);   
            }
        }
        
        String sFirst = "";
        
        while(!firstStack.isEmpty()){
            sFirst = sFirst + String.valueOf(firstStack.pop());
        }
        
         String tSecond = "";
        
        while(!secondStack.isEmpty()){
            tSecond = tSecond + String.valueOf(secondStack.pop());
        }
        
        return sFirst.equals(tSecond);
    }
}