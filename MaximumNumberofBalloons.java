class MaximumNumberofBalloons {
    public int maxNumberOfBalloons(String text) {

        Map<Character, Integer> map = new HashMap<>();

        Set<Character> letters = new HashSet<>();

        letters.add('b');
        letters.add('a');
        letters.add('l');
        letters.add('o');
        letters.add('n');

        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for(char ch : text.toCharArray()){
            if(letters.contains(ch)){
                map.put(ch, map.get(ch) + 1);
            }
        }

        map.put('l', map.get('l')/2);
        map.put('o', map.get('o')/2);

        int res = Integer.MAX_VALUE;
        for(int val : map.values()){
            if(val < res){
                res = val;
            }    
        }

        return res;
    }
}
