// Using extra space
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int pre = 0;
        int max = prefix[n - 1];
        if(max == prefix[0]){
            return 0;
        }
        for(int i = 1; i < n; i++){
            if(max - prefix[i] == prefix[i - 1]){
                return i;
            }

        }
        return -1;
    }
}

// Without any extra space

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
