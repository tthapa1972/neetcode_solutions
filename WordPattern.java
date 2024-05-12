class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String []array = s.split(" ");

        int l = array.length;

        int n = pattern.length();

        if(l!= n){
            return false;
        }

        Map<Character, String> map = new HashMap<>();


        Map<String, Character> revMap = new HashMap<>();

        for(int i = 0;i < n;i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(array[i])){
                    return false;
                }
                continue;
            }

            if(revMap.containsKey(array[i])){
                if(!revMap.get(array[i]).equals(pattern.charAt(i))){
                    return false;
                }
                continue;
            }

            map.put(pattern.charAt(i), array[i]);
            revMap.put(array[i], pattern.charAt(i));
        }

        return true;
    }
}
