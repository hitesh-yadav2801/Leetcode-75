class Solution {
    public int largestAltitude(int[] gain) {
        int curSum = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            curSum += gain[i];
            max = Math.max(max, curSum);
        }
        return max;
    }
}
