class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, n = nums.length, ans = 0;
        int zeros = 0;
        while(right < n){
            if(nums[right] == 0) zeros++;

            while(zeros > 1){
                if(nums[left] == 0) zeros --;
                left++;
            }
            // Here zeros count always be 1 or less than 1 so the window size is right - left(if zeros == 1)
            ans = Math.max(ans, right - left + 1 - zeros);
            right++;
        }
        return ans == n ? ans - 1 : ans;
    }
}
