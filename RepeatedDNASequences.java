class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> repeatedSubSequence = new ArrayList<>();
        
        int i = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        while(i + 10 <= s.length()){
            String subsequence = s.substring(i, i++ + 10);
            map.put(subsequence, map.getOrDefault(subsequence, 0) + 1);
            if(map.get(subsequence) == 2){
                repeatedSubSequence.add(subsequence);
            }
        }
        
        return repeatedSubSequence;
    }
}
