package LeetCode_590;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 590.N 叉树的后序遍历
 *
 * @author ZhongJing </p>
 * @date 2024/02/19 </p>
 */
public class Solution_ZhongJing01 {

    public List<Integer> postorder(Node root) {
        if (root == null) return List.of();

        var stack = new ArrayDeque<Node>();
        var res = new ArrayList<Integer>();
        stack.push(root);

        while (!stack.isEmpty()) {
            var node = stack.pop();
            res.add(0, node.val);
            if (node.children != null) {
                for (Node child : node.children) {
                    stack.push(child);
                }
            }
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
