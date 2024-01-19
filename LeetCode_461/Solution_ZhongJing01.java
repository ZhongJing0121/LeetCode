package LeetCode_461;

/**
 * 461.汉明距离
 *
 * @author ZhongJing </p>
 * @date 2024/01/19 </p>
 */
public class Solution_ZhongJing01 {
    public int hammingDistance(int x, int y) {
        int count = 0;
        x ^= y;
        while (x != 0) {
            count++;
            x &= (x - 1);
        }
        return count;
    }
}
