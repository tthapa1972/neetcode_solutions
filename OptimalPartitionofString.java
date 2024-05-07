class OptimalPartitionofString {
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();

        int res = 1;

        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                res++;
                set = new HashSet<>();
            }
            set.add(ch);
        } 

        return res;
    }
}
