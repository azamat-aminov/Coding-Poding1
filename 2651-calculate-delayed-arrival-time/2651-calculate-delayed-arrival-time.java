class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {  
        
//         int actualTime = arrivalTime + delayedTime;
        
//         if(actualTime == 24) {
//             actualTime = 0;
//         }else if(actualTime > 24){
//             actualTime = actualTime - 24;
//         }
        
      return arrivalTime + delayedTime == 24 ? 0 : (arrivalTime + delayedTime > 24 ? arrivalTime + delayedTime - 24 : arrivalTime + delayedTime);
        
        // return actualTime;
    }
}