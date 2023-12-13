class Solution {
    public int maxArea(int[] height) {
        int l = 0, n = height.length, r = n - 1;
        int maxWater = 0;

        while(l < r){
            int area = (r - l) * Math.min(height[l], height[r]);
            maxWater = Math.max(maxWater, area);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxWater;
    }
}
