class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            set2.add(i);
        }
        for(int i:nums1){
            if(set2.contains(i)){
                set1.remove(i);
                set2.remove(i);
            }
        }
        result.add(new ArrayList<>(set1));
        result.add(new ArrayList<>(set2));
        return result;      

    }
}