class 132Pattern {
    public boolean find132pattern(int[] nums) {

        Stack<Node> stack = new Stack<>();
        int currMin = nums[0];
        for(int i = 1;i < nums.length;i++){
            while(!stack.isEmpty() && nums[i] >= stack.peek().num){
                stack.pop();
            }
            if(!stack.isEmpty() && nums[i] > stack.peek().minValue){
                return true;
            }

            stack.push(new Node(nums[i], currMin));
            currMin = Math.min(nums[i],currMin);
        }        

        return false;
    }
}

class Node{
    int num;
    int minValue;

    public Node(int num, int minValue){
        this.num = num;
        this.minValue = minValue;
    }
}
