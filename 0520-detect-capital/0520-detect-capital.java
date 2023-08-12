class Solution {
  public boolean detectCapitalUse(String word) {
    int uppercaseCounter = 0;
    int lowercaseCounter = 0;
    boolean isStartsWithUppercase = false;
    byte[] bytes = word.getBytes();
    for (byte aByte : bytes) {
      if (aByte >= 65 && aByte <= 90) {
        uppercaseCounter = uppercaseCounter + 1;
      }
      if (aByte >= 97 && aByte <= 122) {
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