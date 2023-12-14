// nLog(n) time and contant space

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, count = 0;
        Arrays.sort(nums);
        int i = 0, j = n - 1;

        while(i < j){
            if(nums[i] + nums[j] < k){
                i++;
            } else if(nums[i] + nums[j] > k){
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}


// Using Hashmap O(n) time and extra space

class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = k - nums[i];
            if(map.containsKey(key) && map.get(key) > 0){
                count++;
                map.put(key, map.get(key) - 1);
            } else {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}
