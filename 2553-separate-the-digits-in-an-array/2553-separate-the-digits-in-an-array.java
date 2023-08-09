class Solution {
    public int[] separateDigits(int[] nums) {
        
        String fullStringOfTheElelents = "";
        for(int num : nums){
            fullStringOfTheElelents = fullStringOfTheElelents + String.valueOf(num);
        }  
            
        String[] stringsFormatOfIntegers = fullStringOfTheElelents.split("");
        int[] result = new int[stringsFormatOfIntegers.length];
        
        for(int i = 0; i < stringsFormatOfIntegers.length; i++){
            result[i] = Integer.parseInt(stringsFormatOfIntegers[i]);
        }
        return result;
    }
}