class ArrayWithElementsNotEqualtoAverageofNeighbors {
    public int[] rearrangeArray(int[] nums) {
     
     Arrays.sort(nums);
     
     int left = 0;
     int right = nums.length - 1;

     List<Integer> list = new ArrayList<>(); 

     while(list.size() !=  nums.length){
        list.add(nums[left]);
        left++;

        if(left <= right){
            list.add(nums[right]);
            right--;
        }
     }

     int []arr = new int[nums.length];
     for(int i = 0; i < nums.length;i++){
        arr[i] = list.get(i);
     }

     return arr;
    }
}
