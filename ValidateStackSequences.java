class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int index = 0;

        Stack<Integer> stack = new Stack<>();

        for(int n : pushed){
            stack.push(n);
            while(index < popped.length && !stack.isEmpty() && popped[index] == stack.peek()){
                stack.pop();
                index++;
            }
        }

        return stack.isEmpty();
        
    }
}
