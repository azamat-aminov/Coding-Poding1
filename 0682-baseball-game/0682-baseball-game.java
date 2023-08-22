class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String operation : operations){
            try {
              int number = Integer.parseInt(operation);
                stack.push(number);
            } catch(Exception e) {
                if(operation.equals("C")){
                    stack.pop();
                }else if(operation.equals("D")){
                    int item = stack.peek();
                    stack.push(2 * item);
                }else if(operation.equals("+")){
                    int lastElement = stack.pop();
                    int rightBeforeLastOne = stack.pop();
                    stack.push(rightBeforeLastOne);
                    stack.push(lastElement);
                    stack.push(lastElement + rightBeforeLastOne);
                }
            }
        }
        while(!stack.isEmpty()){
            sum = sum + stack.pop();
        }
       return sum;
    }
}