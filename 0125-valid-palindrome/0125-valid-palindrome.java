class Solution {
    public boolean isPalindrome(String s) {
        
    String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
    String currentString = alphanumeric.toLowerCase();
    StringBuilder builder = new StringBuilder(currentString);
    StringBuilder reverse = builder.reverse();
    String reverseString = reverse.toString();
    return reverseString.equals(currentString);
        
    }
}