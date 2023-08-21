package LeetCode_2236;

/**
 * @author ZhongJing </p>
 * @date 2023/08/21 </p>
 */
public class Solution_ZhongJing01 {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
