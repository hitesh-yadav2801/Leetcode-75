class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= small){
                small = num;
            } else if(num <= secSmall){
                secSmall = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
