class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(check(s,i,j)){
                    max = Math.max(max,j-i+1);    
                }
            }
        }
        return max;
    }
    public boolean check(String s,int beg , int end){
        Set <Character> set = new HashSet<>();
        for(int i = beg;i<=end;i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
