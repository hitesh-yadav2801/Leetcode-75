class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double curSum = 0;
        int i = 0;
        while(i != k){
            curSum += nums[i++];
        }
        double max = curSum / k;
        while(i < n){
            curSum = curSum - nums[i - k] + nums[i];
            max = Math.max(max, curSum / k);
            i++;
        }
        return max;
    }
}
