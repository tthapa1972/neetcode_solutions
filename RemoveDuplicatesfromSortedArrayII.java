class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        while(r < n){
            int count = 1;
            while((r+1) < n && nums[r] == nums[r+1]){
                r++;
                count++;
            }
            int size = Math.min(2, count);
            for(int i=0;i < size;i++){
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;

    }
}
