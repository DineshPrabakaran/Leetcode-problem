class Solution {
    public int findDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        int n = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                n = nums[i];
        }
        return n;
    }
}
