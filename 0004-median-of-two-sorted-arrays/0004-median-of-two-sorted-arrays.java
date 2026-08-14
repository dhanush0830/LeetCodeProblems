import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int[] merge = new int[n];
        int i=0,j=0,k=0;

        while (i < n1 && j < n2) {
    if (nums1[i] <= nums2[j]) {
        merge[k] = nums1[i];
        i++;
    } else {
        merge[k] = nums2[j];
        j++;
    }
    k++;
}

while (i < n1) {
    merge[k] = nums1[i];
    i++;
    k++;
}

while (j < n2) {
    merge[k] = nums2[j];
    j++;
    k++;
}

        if (n % 2 == 0) {
            int x1 = n / 2 - 1;
            int x2 = n / 2;

            return (merge[x1] + merge[x2]) / 2.0;
        } else {
            return merge[n / 2];
        }
    }
}