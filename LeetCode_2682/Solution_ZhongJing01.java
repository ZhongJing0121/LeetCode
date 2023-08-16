package LeetCode_2682;

/**
 * @author ZhongJing </p>
 * @date 2023/08/16 </p>
 */
public class Solution_ZhongJing01 {
    public int[] circularGameLosers(int n, int k) {
        var all = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            all[i] = i;
        }

        var cur = 1;
        var curK = k;
        var count = 1;
        while (true) {
            cur = (cur + curK) % (n);
            if (cur == 0) cur = n;

            if (all[cur] == 0) {
                break;
            }
            all[cur] = 0;
            curK += k;
            count++;
        }

        var res = new int[n - count];
        var index = 0;
        for (int i = 2; i <= n; i++) {
            if (all[i] != 0) {
                res[index++] = all[i];
            }
        }

        return res;
    }
}
