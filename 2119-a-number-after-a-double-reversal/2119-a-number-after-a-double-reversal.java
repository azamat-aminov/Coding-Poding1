class Solution {
    public boolean isSameAfterReversals(int num) {

        int reversed1 = getReversed(num);

        return getReversed(reversed1) == num;
    }
    
    private int getReversed(int number) {
        int reversed = 0;

        while(number > 0) {
            int reminder = number % 10;
            number = number / 10;
            reversed = 10 * reversed + reminder;
        }
        return reversed;
    }
}