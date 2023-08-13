class Solution {
  public String sortSentence(String s) {
     
    String[] words = s.split(" ");
    String[] resultWords = new String[words.length + 1];
      
    for (int i = 0; i < words.length; i++) {
      String index = words[i].substring(words[i].length() - 1);
      resultWords[Integer.parseInt(index)] = words[i].substring(0, words[i].length() - 1);
    }
      
    StringBuilder builder = new StringBuilder();
      
    for (int i = 1; i < resultWords.length ; i++) {
      builder.append(resultWords[i]).append(" ");
    }
      
    return builder.substring(0, builder.toString().length() - 1);
    }
}
  