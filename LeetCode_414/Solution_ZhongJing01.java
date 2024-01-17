package LeetCode_414;

import java.util.TreeSet;

/**
 * 414.第三大的数
 *
 * @author ZhongJing </p>
 * @date 2024/01/16 </p>
 */
public class Solution_ZhongJing01 {
    public int thirdMax(int[] nums) {
        var treeSet = new TreeSet<Integer>();
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        return treeSet.size() == 3 ? treeSet.first() : treeSet.last();
    }
}
