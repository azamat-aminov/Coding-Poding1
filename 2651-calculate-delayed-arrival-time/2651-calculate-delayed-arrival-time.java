class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {  
        
        int actualTime = arrivalTime + delayedTime;
        
//         if(actualTime == 24) {
//             actualTime = 0;
//         }else if(actualTime > 24){
//             actualTime = actualTime - 24;
//         }
        
      return actualTime == 24 ? 0 : (actualTime > 24 ? actualTime - 24 : actualTime);
        
        // return actualTime;
    }
}