class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longestStreak = 0;
        int streak = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                streak = 1;
                while(set.contains(num+1)){
                    streak+=1;
                    num++;
                }
                longestStreak = Math.max(longestStreak, streak);
            }
        }
        return longestStreak;
    }
}
