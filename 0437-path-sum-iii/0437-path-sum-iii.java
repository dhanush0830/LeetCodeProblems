class Solution {

    public int dfs(TreeNode root, long target) {

        if (root == null)
            return 0;

        int count = 0;

        if (root.val == target) {
            count++;
        }

        count += dfs(root.left, target - root.val);
        count += dfs(root.right, target - root.val);

        return count;
    }

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null)
            return 0;

        return dfs(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }
}