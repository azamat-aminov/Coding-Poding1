class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {  
        
      int actualTime = arrivalTime + delayedTime; 
      return actualTime == 24 ? 0 : (actualTime > 24 ? actualTime - 24 : actualTime);
    }
}