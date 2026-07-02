class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int rich = 0;

        for(int i = 0; i < m; i++) {
            int sum = 0;
            int n = accounts[i].length;

            for(int j = 0; j < n; j++) {
                sum = sum + accounts[i][j];
            }

            rich = (sum > rich) ? sum : rich;
        }

        return rich;
    }
}