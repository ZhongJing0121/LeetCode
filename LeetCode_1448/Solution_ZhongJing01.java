package LeetCode_1448;

/**
 * 1448.统计二叉树中好节点的数目
 *
 * @author ZhongJing </p>
 * @date 2023/09/04 </p>
 */
public class Solution_ZhongJing01 {

    private int count = 0;

    public int goodNodes(TreeNode root) {
        process(root, Integer.MIN_VALUE);
        return count;
    }

    public void process(TreeNode node, int maxValue) {
        // 如果为空直接退出
        if (node == null) return;

        // 如果不为空，判断之前的节点是否有比我大的
        if (maxValue <= node.val) count++;

        // 之前最大的节点和自己比较大小，取最大值
        maxValue = Math.max(node.val, maxValue);

        process(node.left, maxValue);
        process(node.right, maxValue);
    }

    class TreeNode {
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
