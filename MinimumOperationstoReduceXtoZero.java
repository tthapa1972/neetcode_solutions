class MinimumOperationstoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int total_sum = IntStream.of(nums).sum();

        int target = total_sum - x;
        int current_sum = 0;
        int l = 0;
        int max_len = -1;
        int n = nums.length;

        for(int r = 0;r < n;r++){
            current_sum += nums[r];

            while( l <= r && current_sum > target){
                current_sum -= nums[l];
                l++;
            }

            if(current_sum == target){
                max_len =  Math.max(max_len , r - l + 1);
            }
        }

        return max_len == -1? -1: n - max_len;
    }
}
