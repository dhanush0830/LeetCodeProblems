class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return new ArrayList<>();

        }
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i : nums){
            set.add(i);
        }
        for(int i = nums[0]; i < nums[n-1]; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
        
    }
}