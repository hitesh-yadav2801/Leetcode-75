class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length(), i = 0;
        int cur = 0;
        while(i < k){
            if(isVowel(s.charAt(i))){
                cur++;
            }
            i++;
        }
        int max = cur;
        while(i < n){
            boolean next = isVowel(s.charAt(i));
            boolean prev = isVowel(s.charAt(i - k));
            if(next && !prev){
                cur++;
            } else if(!next && prev){
                cur--;
            } 
            max = Math.max(cur, max);
            i++;
        }
        return max;
    }
    boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}
