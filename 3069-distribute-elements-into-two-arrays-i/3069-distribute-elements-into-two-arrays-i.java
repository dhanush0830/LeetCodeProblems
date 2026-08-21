class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int size1 = 1;
        int size2 = 1;

        int i = 2;

        while (i < n) {

            if (arr1[size1 - 1] > arr2[size2 - 1]) {
                arr1[size1] = nums[i];
                size1++;
            } else {
                arr2[size2] = nums[i];
                size2++;
            }

            i++;
        }

        int[] res = new int[n];

        int k = 0;

        for (int j = 0; j < size1; j++) {
            res[k++] = arr1[j];
        }

        for (int j = 0; j < size2; j++) {
            res[k++] = arr2[j];
        }

        return res;
    }
}