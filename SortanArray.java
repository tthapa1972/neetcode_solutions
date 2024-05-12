class SortanArray {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        mergeSort(nums, low, high);

        return nums;
    }

    public void mergeSort(int []nums, int low, int high){

        if(low>=high) return;

        int mid = (low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1,high);
        merge(nums, low, mid, high);
    }

    public void merge(int []arr, int low, int mid, int high){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;           
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);

        }
 
    }
}
