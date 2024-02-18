package LeetCode_589;

import java.util.ArrayList;
import java.util.List;

/**
 * 589.N 叉树的前序遍历
 *
 * @author ZhongJing </p>
 * @date 2024/02/18 </p>
 */
public class Solution_ZhongJing01 {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        process(root, res);
        return res;
    }

    public void process(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node child : root.children) {
            process(child, list);
        }
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
