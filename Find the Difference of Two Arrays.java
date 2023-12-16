class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        for(int ele : nums1){
            s1.add(ele);   
        }
        for(int ele : nums2){
           s2.add(ele);
        }
        
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>(s1);
        List<Integer> lst2 = new ArrayList<>(s2);
        lst1.removeAll(s2);
        lst2.removeAll(s1);
        lst.add(lst1);
        lst.add(lst2);
        return lst;
    }
}
