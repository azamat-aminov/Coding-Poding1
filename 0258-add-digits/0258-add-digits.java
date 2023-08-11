class Solution {
    public int addDigits(int num) {
        int sumOfDigits = 0;
    while (num > 0) {
      int temp = num % 10;
      num = num / 10;
//      System.out.println(temp);
      sumOfDigits = sumOfDigits + temp;
    }
    if (sumOfDigits < 10) {
      return sumOfDigits;
    } else {
      return addDigits(sumOfDigits);
    }
    }
}