class Solution {
    public static int romanToInt(String s) {

        int number;
        int prev = 0;
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            if (number < prev) {
                result = result - number;
            } else {
                result = result + number;
            }
            prev = number;
        }

        return result;
    }
}