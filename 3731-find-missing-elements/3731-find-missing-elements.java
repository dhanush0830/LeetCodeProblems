class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();

        if (nums == null || nums.length <= 1) {
            return list;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int curr = nums[i];
            int next = nums[i + 1];

            for (int j = curr + 1; j < next; j++) {
                list.add(j);
            }
        }

        return list;
    }
}