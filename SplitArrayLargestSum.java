class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int l = Arrays.stream(nums).max().getAsInt();
        int r = Arrays.stream(nums).sum();
        int res = 0;
        while(l<=r){
            int mid = l + (r - l)/2;
            if(canSplit(mid, nums, k)){
                res = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return res;
    }

    public boolean canSplit(int largest, int []nums, int k){
        int currSum = 0;
        int noOfSplits = 1;

        for(int n : nums){
            currSum+=n;
            if(currSum > largest){
                noOfSplits+=1;
                currSum = n;
            }
        }

        return (noOfSplits <= k);
    }

}
