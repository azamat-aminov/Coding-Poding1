class Solution {
    public int countDigits(int num) {

        int number = num;

        List<Integer> digits = new ArrayList<>();

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            digits.add(digit);
        }

        int counter = 0;

        for (int digit : digits) {
            if (number % digit == 0) {
                counter++;
            }
        }
        return counter;
    }
}