class Solution {
    public boolean isAnagram(String s, String t) {
        var freq1 = new int[26];
        var freq2 = new int[26];
        int l2 = t.length();
        for(var ch : s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(var ch : t.toCharArray()){
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
