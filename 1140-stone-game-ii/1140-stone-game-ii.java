class Solution {

    int[][] dp;
    int[] suffix;

    public int dfs(int index, int M, int[] piles) {

        // No piles remaining
        if (index >= piles.length) {
            return 0;
        }

        // Already calculated
        if (dp[index][M] != -1) {
            return dp[index][M];
        }

        // All remaining stones
        int remaining = suffix[index];

        int opponent = Integer.MAX_VALUE;

        // We can take 1 to 2*M piles
        for (int X = 1; X <= 2 * M && index + X <= piles.length; X++) {

            int newM = Math.max(M, X);

            int opponentStones = dfs(index + X, newM, piles);

            opponent = Math.min(opponent, opponentStones);
        }

        // Current player gets:
        // total remaining - maximum stones opponent can get
        dp[index][M] = remaining - opponent;

        return dp[index][M];
    }

    public int stoneGameII(int[] piles) {

        int n = piles.length;

        // suffix[i] = sum of piles from i to n-1
        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        // dp[index][M]
        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return dfs(0, 1, piles);
    }
}