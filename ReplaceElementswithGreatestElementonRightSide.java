class ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] arr) {
        int rightMax = -1;
        int n = arr.length;
        for(int i = (n-1);i>=0;i--){
            int newMax = Math.max(arr[i], rightMax);
            arr[i] = rightMax;
            rightMax = newMax;
        }

        return arr;
    }
}
