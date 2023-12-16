class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefixSum = 0;
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
        }
        int curSum = 0;
        for(int i = 0; i < n; i++){
            if(2 * curSum + nums[i] == prefixSum){
                return i;
            }
            curSum += nums[i];
        }
        return -1;
    }
}
