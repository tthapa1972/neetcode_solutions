class  FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());
        res.add(new ArrayList());
        List<Integer> num1List = new ArrayList<>();
        List<Integer> num2List = new ArrayList<>();

        for(int n : nums1){
            num1List.add(n);
        }

        for(int n : nums2){
            num2List.add(n);
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int n : nums1){
            if(!num2List.contains(n)){
                set1.add(n);
            }
        }

        for(int n : nums2){
            if(!num1List.contains(n)){
                set2.add(n);
            }
        }


        for(int n : set1) res.get(0).add(n);
        for(int n : set2) res.get(1).add(n);

        return res; 
    } 
}
