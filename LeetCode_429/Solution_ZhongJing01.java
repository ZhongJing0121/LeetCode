package LeetCode_429;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 429.N 叉树的层序遍历
 *
 * @author ZhongJing </p>
 * @date 2024/02/17 </p>
 */
public class Solution_ZhongJing01 {

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return List.of();
        }

        // 如果树不空
        var res = new ArrayList<List<Integer>>();
        var queue = new ArrayDeque<Node>();
        queue.push(root);
        while (!queue.isEmpty()) {
            var size = queue.size();
            var tmp = new ArrayList<Integer>(size);
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                tmp.add(node.val);
                queue.addAll(node.children);
            }
            res.add(tmp);
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
