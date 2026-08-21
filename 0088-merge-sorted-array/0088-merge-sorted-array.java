class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        int l=0;
        int r=0;

        while(l<m && r<n){
            if(nums1[l] <= nums2[r]){
                list.add(nums1[l]);
                l++;
            }else{
                list.add(nums2[r]);
                r++;
            }
        }
        while(l < m){
            list.add(nums1[l]);
            l++;
        }
        while(r<n){
            list.add(nums2[r]);
            r++;
        }
        int k=0;

        for(int i:list){
            nums1[k++]=i;
        }
    }
}