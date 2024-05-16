class Maximum NumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();

        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');

        int l = 0, cnt = 0, max = 0;
        int n = s.length();
        
        for(int r = 0;r < n;r++){
            cnt += (vowels.contains(s.charAt(r)) ? 1 : 0);

            if(r-l+1 > k){
                cnt -= (vowels.contains(s.charAt(l)) ? 1 : 0);
                l++;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}
