class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];

        if(n==1){
            return nums;
        }
        int k=0;
        int l=0;
        int r=n;
        while(k < 2*n){

            if(k%2 == 0){
                res[k]=nums[l];
                l++;
            }else{
                res[k]=nums[r];
                r++;
            }
            k++;

        }
        return res;

    }
}