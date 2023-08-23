class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> firstStack = new Stack<>();
        Stack<Character> secondStack = new Stack<>();
        
        // char[] first = s.toCharArray();
        // char[] second = t.toCharArray();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '#' && !firstStack.isEmpty()){
                    firstStack.pop();
            }else{
                if(ch != '#'){
                    firstStack.push(ch);
                }   
            }
        }
        for(int k = 0; k < t.length(); k++){
            char ch = t.charAt(k);
            if(ch == '#' && !secondStack.isEmpty()){
                    secondStack.pop();
            }else{
                if(ch != '#'){
                    secondStack.push(ch);   
                }   
            }
        }
        
//         StringBuilder sFirst = new StringBuilder();
        
//         while(!firstStack.isEmpty()){
//             // sFirst = sFirst + String.valueOf(firstStack.pop());
//             sFirst.append(String.valueOf(firstStack.pop()));
//         }
        
//          StringBuilder tSecond = new StringBuilder();
        
//         while(!secondStack.isEmpty()){
//             // tSecond = tSecond + String.valueOf(secondStack.pop());
//             tSecond.append(String.valueOf(secondStack.pop()));
//         }
        
        return firstStack.equals(secondStack);
        // return sFirst.toString().equals(tSecond.toString());
    }
}