package LeetCode_455;

import java.util.Arrays;

/**
 * 455.分发饼干
 *
 * @author ZhongJing </p>
 * @date 2024/01/18 </p>
 */
public class Solution_ZhongJing01 {
    public int findContentChildren(int[] g, int[] s) {
        int gIndex = g.length - 1;
        int sIndex = s.length - 1;
        // 给小胖子们排序
        Arrays.sort(g);
        // 给饼干排序
        Arrays.sort(s);

        int res = 0;

        while (gIndex >= 0) {
            // 如果饼干还有，并且能满足当前这个胃口最大的小胖子，res就+1
            // 如果不满足，因为是从大到小排列饼干，这个小胖子永远都不可能满足
            if (sIndex >= 0 && s[sIndex] >= g[gIndex]) {
                res++;
                // 饼干被吃掉了，指针前移
                sIndex--;
            }
            // 满足或者不满足，都要换下一个小胖子
            gIndex--;
        }
        return res;
    }
}
