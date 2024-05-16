class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int i = 0;
        int l = 0;
        int r = 0;
        int n = nums.length;
        
        int []output = new int[n-k + 1];
        
        Deque<Integer> deque = new LinkedList<>();

        for(;r < n;r++){
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[r]){
                deque.pollLast();
            }

            deque.addLast(r);

            if(l > deque.peekFirst()){
                deque.pollFirst();
            }

            if((r+1)>=k){
                output[i++] = nums[deque.peekFirst()];
                l++;
            }
        }   

        return output;
    }
}
