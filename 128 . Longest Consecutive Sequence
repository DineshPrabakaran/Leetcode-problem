class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int curr,len = 1,ml = 0;
        for(int num: nums){
            if(!set.contains(num-1)){
                //curr = num;
                len = 0;
            while(set.contains(num)){
                num = num + 1;
                len++;
            }
            }
            ml = Math.max(ml,len);
        }
        return ml;
    }
}
