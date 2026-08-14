import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int[] merge = new int[n];

        for (int i = 0; i < n1; i++) {
            merge[i] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            merge[n1 + i] = nums2[i];
        }

        Arrays.sort(merge);

        if (n % 2 == 0) {
            int x1 = n / 2 - 1;
            int x2 = n / 2;

            return (merge[x1] + merge[x2]) / 2.0;
        } else {
            return merge[n / 2];
        }
    }
}