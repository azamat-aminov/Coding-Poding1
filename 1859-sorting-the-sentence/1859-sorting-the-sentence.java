class Solution {
  public String sortSentence(String s) {

    Map<Integer, String> map = new HashMap<>();
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++) {
      char index = words[i].charAt(words[i].length() - 1);
      map.put(Integer.parseInt(String.valueOf(index)), words[i].substring(0, words[i].length() - 1));
    }

    String fullSentence = "";
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
      fullSentence = fullSentence + entry.getValue() + " ";
    }
    return fullSentence.substring(0, fullSentence.length() - 1);
  }
}