class Solution {
    public boolean isSameAfterReversals(int num) {
        
        int number = num;
        
        int reversed1 = 0;
        
        while(number > 0) {
            int reminder = number % 10;
            number = number / 10;
            reversed1 = 10 * reversed1 + reminder;
        }
        
         int reversed2 = 0;
        
        while(reversed1 > 0) {
            int reminder = reversed1 % 10;
            reversed1 = reversed1 / 10;
            reversed2 = 10 * reversed2 + reminder;
        }
        
        return reversed2 == num;
    }
}