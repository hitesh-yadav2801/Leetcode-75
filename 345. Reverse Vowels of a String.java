class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(isVowel(arr[l]) && isVowel(arr[r])){
                swap(arr, l, r);
                l++;
                r--;
            } else if(!isVowel(arr[l])){
                l++;
            } else if(!isVowel(arr[r])){
                r--;
            }
        }
        return new String(arr);
    }
    public void swap(char[] arr, int l, int r){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'A') return true;
        else if(ch == 'e' || ch == 'E') return true;
        else if(ch == 'i' || ch == 'I') return true;
        else if(ch == 'o' || ch == 'O') return true;
        else if(ch == 'u' || ch == 'U') return true;

        return false;
    }
}
