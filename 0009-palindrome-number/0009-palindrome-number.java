class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = builder.reverse();
        return reverse.toString().equals(String.valueOf(x));
    }
}