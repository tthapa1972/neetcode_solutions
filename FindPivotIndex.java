class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for(int num : nums){
            sum+= num;
        }
        int right = 0;
        int left = 0;

        for(int i = 0;i < nums.length;i++){
            right = sum - left - nums[i];

            if(right == left) return i;

            left += nums[i];
        }

        return -1;

    }
}
