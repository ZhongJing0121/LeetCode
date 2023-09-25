package LeetCode_2240;

/**
 * 2240.买钢笔和铅笔的方案数
 *
 * @author ZhongJing </p>
 * @date 2023/09/25 </p>
 */
public class Solution_ZhongJing01 {
    private int count = 0;

    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        if (cost1 < cost2) {
            return waysToBuyPensPencils(total, cost2, cost1);
        }
        // cost1购买的数量
        var count = 0;
        // 答案
        var res = 0;
        // c1买count个之后，c2能卖多少个，c2可以不买，所以方案+1
        while (count * cost1 <= total) {
            res += (total - cost1 * count) / cost2 + 1;
            count++;
        }
        return res;
    }
}
