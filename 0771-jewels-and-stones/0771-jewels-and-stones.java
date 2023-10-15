class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
//         Map<Character, Integer> map = new HashMap<>();
        
//         char[] chars = jewels.toCharArray();
        
//         for(char ch : stones.toCharArray()) {
//             map.merge(ch, 1, Integer::sum);
//         }
        
//         int sum = 0;
        
//         for(char ch : chars) {
//            if(map.get(ch) != null){
//                sum = sum + map.get(ch);
//            }
//         }
        
//         return sum;
        
        int counter = 0;
        
        Set<Character> set = new HashSet<>();
        for(char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        for(char ch : stones.toCharArray()) {
            if(set.contains(ch)) {
                counter++;
            }
        }
        return counter;
    }
}