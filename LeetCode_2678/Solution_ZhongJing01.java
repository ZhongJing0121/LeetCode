package LeetCode_2768;

/**
 * 2678.老人的数目
 *
 * @author ZhongJing </p>
 * @date 2023/10/23 </p>
 */
public class Solution_ZhongJing01 {
    public int countSeniors(String[] details) {
        var res = 0;

        for (String detail : details) {
            var age = (detail.charAt(11) - '0') * 10 + detail.charAt(12) - '0';
            if (age > 60) {
                res++;
            }
        }
        return res;
    }
}
