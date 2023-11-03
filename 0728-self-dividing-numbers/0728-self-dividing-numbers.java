class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> selfDividingNumbers = new ArrayList<>();
      
        for(int num = left; num <= right; num++) {
            
            int number = num;
            boolean isSelfDividing = true;
            
            while(number > 0) {
                int digit = number % 10;
                if(digit == 0 || num % digit != 0) {
                    isSelfDividing = false;
                    break;
                } 
                number = number / 10;
          }
            if(isSelfDividing) {
               selfDividingNumbers.add(num); 
            }
        }
        return selfDividingNumbers;
    }
}