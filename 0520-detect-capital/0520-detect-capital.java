class Solution {
  public boolean detectCapitalUse(String word) {
    //Uppercase letters values min = 65 and max = 90 regarding ASCII table
    //Lowercase letters values min = 97 and max = 122 regarding ASCII table
    int uppercaseCounter = 0;
    int lowercaseCounter = 0;
    boolean isStartsWithUppercase = false;
    byte[] bytes = word.getBytes();
    for (int i = 0; i < bytes.length; i++) {
      if (bytes[i] >= 65 && bytes[i] <= 90) {
        uppercaseCounter = uppercaseCounter + 1;
      }
      if (bytes[i] >= 97 && bytes[i] <= 122) {
        lowercaseCounter = lowercaseCounter + 1;
      }
      if (bytes[0] >= 65 && bytes[0] <= 90) {
        isStartsWithUppercase = true;
      }
    }
    return uppercaseCounter == bytes.length || //All letters in this word are capitals, like "USA".
        lowercaseCounter == bytes.length ||    //All letters in this word are not capitals, like "leetcode".
        (lowercaseCounter == bytes.length - 1 && isStartsWithUppercase); //Only the first letter in this word is capital, like "Google".
  }
}