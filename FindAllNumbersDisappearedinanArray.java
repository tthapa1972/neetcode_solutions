class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer> result = new ArrayList<>();

     for(int num : nums){
        int index = Math.abs(num) - 1;
        nums[index] = -1 * Math.abs(nums[index]);
     }   

     for(int i = 0;i < nums.length;i++){
        if(nums[i] > 0)
            result.add(i+1);        
     }

     return result;

    }
}
