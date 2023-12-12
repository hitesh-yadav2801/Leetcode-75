class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        int n = words.length;
        for(int i = n - 1; i >= 0; i--){
            if(!words[i].trim().isEmpty()){
                ans.append(words[i]);
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}
