class Solution {
    public int maxPower(String s) {
        
        char[] letters = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int counter = 0;
         for (int i = 0; i < letters.length - 1 ; i++) {
             if(letters[i] == letters[i + 1]){
                 counter = counter + 1;
             }else{
                 list.add(counter);
                 counter = 0;
             }
         }
        list.add(counter);
        
        int maxValue = 0;
        
        System.out.println(list);
        for(int element : list){
            if(element > maxValue){
                maxValue = element;
            }
        }
        return maxValue + 1;
    }
}