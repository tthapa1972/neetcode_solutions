class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {


        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()){
            return res;
        }else if(p.length() == 0){
            res.add(0);
            return res;
        }

        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        for(int i = 0;i < p.length();i++){
            pMap.put(p.charAt(i), 1+ pMap.getOrDefault(p.charAt(i), 0));
            sMap.put(s.charAt(i), 1+ sMap.getOrDefault(s.charAt(i), 0));
        }

        if(pMap.equals(sMap)){
            res.add(0);
        }

        int l = 0;

    

        for(int r = p.length();r < s.length();r++){
            sMap.put(s.charAt(r), 1+ sMap.getOrDefault(s.charAt(r), 0)); 
            sMap.put(s.charAt(l), sMap.get(s.charAt(l)) - 1);

            if(sMap.get(s.charAt(l)) == 0){
                sMap.remove(s.charAt(l));
            }    
            l+=1;
            if(pMap.equals(sMap)){
                res.add(l);
            }      
        }       
        
        return res;
    }

}
