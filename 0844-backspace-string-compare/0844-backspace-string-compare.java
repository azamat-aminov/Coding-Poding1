class Solution {
    public boolean backspaceCompare(String s, String t) {

        Deque<Character> firstStack = new ArrayDeque<>();
        Deque<Character> secondStack = new ArrayDeque<>();

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] == '#') {
                if (!firstStack.isEmpty()) {
                    firstStack.pop();
                }
            } else {
                firstStack.push(first[i]);
            }
        }
        for (int k = 0; k < second.length; k++) {
            if (second[k] == '#') {
                if (!secondStack.isEmpty()) {
                    secondStack.pop();
                }
            } else {
                secondStack.push(second[k]);
            }
        }

        StringBuilder sFirst = new StringBuilder();
        while(!firstStack.isEmpty()){
            sFirst.append(String.valueOf(firstStack.pop()));
        }
         StringBuilder tSecond = new StringBuilder(); 
        while(!secondStack.isEmpty()){
            tSecond.append(String.valueOf(secondStack.pop()));
        }
        return sFirst.toString().equals(tSecond.toString());
    }
}