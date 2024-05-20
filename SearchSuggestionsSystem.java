class SearchSuggestionsSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();

        Arrays.sort(products);

        int l = 0;
        int r = products.length - 1;

        for(int i = 0; i < searchWord.length();i++){
            char ch = searchWord.charAt(i);
            while(l <= r && (products[l].length() <= i || products[l].charAt(i) != ch)){
                l++;
            }
            while(l <= r && (products[r].length() <= i || products[r].charAt(i) != ch)){
                r--;
            }
            List<String> list = new ArrayList<>();
            for(int j = l;j<(l+3) && j <= r;j++){
                list.add(products[j]);
            }
            res.add(list);
        }

        return res;
    }
}
