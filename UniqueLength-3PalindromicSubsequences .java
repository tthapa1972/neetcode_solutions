class  UniqueLength-3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, 1+ map.getOrDefault(ch, 0));
        }

        int res  = 0;

        for(char key : map.keySet()){
            if(map.get(key) >= 2){
                int fo = s.indexOf(key), lo = s.lastIndexOf(key);
                Set<Character> between = new HashSet<>();
                for(int i = fo+1;i < lo;i++){
                    between.add(s.charAt(i));
                }
                res += between.size();
            }
        }

        return res;
    }
}
