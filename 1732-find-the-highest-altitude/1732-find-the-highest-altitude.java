class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int sum = 0;
        for(int i: gain){
            sum += i;
            maxAltitude =Math.max(maxAltitude,sum);
        }
        return maxAltitude;
        
    }
}