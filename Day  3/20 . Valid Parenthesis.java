class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()){
            if(ch == '(') s.push(')');
            else if(ch == '[') s.push(']');
            else if(ch == '{') s.push('}');
            else if(s.isEmpty() || s.pop() != ch) return false;
        }
        return s.isEmpty();
    }
}
