class Solution {
    public boolean isSameAfterReversals(int num) {
        return getReversed(getReversed(num)) == num;
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