class NamingACompany {
    public long distinctNames(String[] ideas) {
        
        Map<Character, Set<String>> map = new HashMap<>();

        for(String idea : ideas){
            char firstLetter = idea.charAt(0);
            if(map.containsKey(firstLetter)){
                Set<String> set = map.get(firstLetter);
                set.add(idea.substring(1));
                map.put(firstLetter, set);
            }else{
                Set<String> set = new HashSet<>();
                set.add(idea.substring(1));
                map.put(firstLetter, set);
            }
        }

        long res = 0;

        for(char ch1 : map.keySet()){
            for(char ch2: map.keySet()){
                if(ch1 == ch2){
                    continue;
                }

                int intersect = 0;
                for(String value : map.get(ch1)){
                    if(map.get(ch2).contains(value)){
                        intersect++;
                    }
                }

                int distinct1 = map.get(ch1).size() - intersect;
                int distinct2 = map.get(ch2).size() - intersect;

                res += (distinct1 * distinct2);
            }
        }

        return res;
    }
}
