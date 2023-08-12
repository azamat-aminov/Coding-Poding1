class Solution {
  public String sortSentence(String s) {

    // Map<Integer, String> map = new HashMap<>();
     
    String[] words = s.split(" ");
    String [] elements = new String[words.length + 1];
    for (int i = 0; i < words.length; i++) {
      char index = words[i].charAt(words[i].length() - 1);
      elements[Integer.parseInt(String.valueOf(index))] = words[i].substring(0, words[i].length() - 1);
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i < elements.length ; i++) {
      builder.append(elements[i]).append(" ");
    }
    return builder.substring(0, builder.toString().length() - 1);
    }
}
  